package com.example.lesson25_video_image_text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    VideoView videoView;
    Button chooseImage, uploadImage, download;
    Button chooseVideo, uploadVideo;
    Uri filepath;

    DatabaseReference databaseReference;
    StorageReference storageReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.upload_image_view);
        uploadImage = findViewById(R.id.upload_image);
        chooseImage = findViewById(R.id.select_image);
        chooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,0);
            }
        });
        videoView = findViewById(R.id.upload_video_view);
        uploadVideo = findViewById(R.id.upload_video);
        download = findViewById(R.id.download_button);
        chooseVideo = findViewById(R.id.select_video);
        chooseVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("video/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 0);
            }
        });
        uploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UploadImage();
            }
        });

        uploadVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UploadVideo();
            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MediaStore.Video.this, AllActivity.class));
            }
        });


        storageReference = FirebaseStorage.getInstance().
                getReference("Stored images/");
        databaseReference = FirebaseDatabase.getInstance().
                getReference("All");
        storageReference = FirebaseStorage.getInstance().
                getReference("Stored videos/");
        databaseReference = FirebaseDatabase.getInstance().
                getReference("All");

        download = findViewById(R.id.download_button);
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,
                        AllActivity.class));
            }
        });



    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == RESULT_OK && data != null) {
            filepath = data.getData();
            Picasso.with(this)
                    .load(filepath)
                    .into(imageView);
            videoView.setVideoURI(filepath);
            videoView.start();
        }
        if (requestCode == 0 && resultCode == RESULT_OK && data != null){
            filepath = data.getData();
            videoView.setVideoURI(filepath);
            videoView.start();
        }
    }


    public void UploadImage () {
        if (filepath != null) {
            StorageReference storageRef = storageReference.child(
                    System.currentTimeMillis()+ ":" +
                            getFilesExtension(filepath));
            storageRef.putFile(filepath).addOnSuccessListener(
                    new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MainActivity.this,"successful",
                                    Toast.LENGTH_SHORT).show();
                            Task<Uri> result = taskSnapshot.getMetadata().
                                    getReference().getDownloadUrl();
                            result.addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    Upload upload = new Upload();
                                    upload.setImageUrl(String.valueOf(uri));
                                    String key = databaseReference.push().getKey();
                                    databaseReference.child(key).setValue(upload);
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"",
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    public void UploadVideo(){
        if (filepath != null){
            final ProgressDialog dialog = new ProgressDialog(this);
            dialog.setMessage("Uploading ...");
            dialog.show();
            StorageReference storageRef = storageReference.child(
                    System.currentTimeMillis() + ":" +
                            getFilesExtension(filepath));
            storageRef.putFile(filepath).addOnSuccessListener(
                    new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MediaStore.Video.this,
                                    "successful", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();
                            Task<Uri> result = taskSnapshot.getMetadata().getReference().
                                    getDownloadUrl();
                            result.addOnSuccessListener(new OnSuccessListener<Uri>() {
                                @Override
                                public void onSuccess(Uri uri) {
                                    Upload upload = new Upload();
                                    upload.setVideoUrl(String.valueOf(uri));
                                    String key = databaseReference.push().getKey();
                                    databaseReference.child(key).setValue(upload);
                                }
                            });
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MediaStore.Video.this,
                            "", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }




    public String getFilesExtension (Uri uri) {
        ContentResolver cR = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri));
    }
}

    /*@Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.upload_image_view);
        upload = findViewById(R.id.upload_image);
        upload = findViewById(R.id.upload_video);
        download = findViewById(R.id.download_button);
        choose = findViewById(R.id.select_image);
        choose = findViewById(R.id.select_video);

        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,0);
            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadImage();
            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AllActivity.class));
            }
        });
        //FirebaseApp.initializeApp(this);
        storageReference = FirebaseStorage.getInstance().getReference("Stored images/");
        databaseReference = FirebaseDatabase.getInstance().getReference("Images");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == RESULT_OK && data != null) {
            filepath = data.getData();
            Picasso.with(this)
                    .load(filepath)
                    .into(imageView);
        }
    }

    public void uploadImage () {
        if (filepath != null) {
            StorageReference storageRef = storageReference.child(System.currentTimeMillis()+ ":" +
                    getFileExtension(filepath));
            storageRef.putFile(filepath).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Toast.makeText(MainActivity.this,"successful", Toast.LENGTH_SHORT).show();
                    Task<Uri> result = taskSnapshot.getMetadata().getReference().getDownloadUrl();
                    result.addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            Upload upload = new Upload();
                            upload.setImageUrl(String.valueOf(uri));
                            String key = databaseReference.push().getKey();
                            databaseReference.child(key).setValue(upload);
                        }
                    });
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public String getFileExtension (Uri uri) {
        ContentResolver cR = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri));
    }
}*/


