package com.redeveight.awsimages.bucket;

public enum BucketName {
    PROFILE_IMAGE("aws-images-0");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
