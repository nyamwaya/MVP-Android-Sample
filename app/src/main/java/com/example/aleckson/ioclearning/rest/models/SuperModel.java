package com.example.aleckson.ioclearning.rest.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Aleckson on 9/2/2015.
 */
public class SuperModel {


    @Expose
    private String name;
    @Expose
    private Logo logo;
    //for deals
    @Expose
    private Photo photo;
    //for deals
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }


    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public class CoverPhoto {

        @Expose
        private String url;

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Icon {

        @Expose
        private String url;

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

    }

    public class Logo {

        @Expose
        private String url;
        @SerializedName("cover_photo")
        @Expose
        private CoverPhoto coverPhoto;
        @Expose
        private Thumbnail thumbnail;
        @Expose
        private Icon icon;

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The coverPhoto
         */
        public CoverPhoto getCoverPhoto() {
            return coverPhoto;
        }

        /**
         * @param coverPhoto The cover_photo
         */
        public void setCoverPhoto(CoverPhoto coverPhoto) {
            this.coverPhoto = coverPhoto;
        }

        /**
         * @return The thumbnail
         */
        public Thumbnail getThumbnail() {
            return thumbnail;
        }

        /**
         * @param thumbnail The thumbnail
         */
        public void setThumbnail(Thumbnail thumbnail) {
            this.thumbnail = thumbnail;
        }

        /**
         * @return The icon
         */
        public Icon getIcon() {
            return icon;
        }

        /**
         * @param icon The icon
         */
        public void setIcon(Icon icon) {
            this.icon = icon;
        }

    }

    public class Thumbnail {

        @Expose
        private String url;

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

    }

    //For Deals
    public class Photo {

        @Expose
        private String url;
        @SerializedName("cover_photo")
        @Expose
        private CoverPhoto coverPhoto;
        @Expose
        private Thumbnail thumbnail;

        /**
         * @return The url
         */
        public String getUrl() {
            return url;
        }

        /**
         * @param url The url
         */
        public void setUrl(String url) {
            this.url = url;
        }

        /**
         * @return The coverPhoto
         */
        public CoverPhoto getCoverPhoto() {
            return coverPhoto;
        }

        /**
         * @param coverPhoto The cover_photo
         */
        public void setCoverPhoto(CoverPhoto coverPhoto) {
            this.coverPhoto = coverPhoto;
        }

        /**
         * @return The thumbnail
         */
        public Thumbnail getThumbnail() {
            return thumbnail;
        }

        /**
         * @param thumbnail The thumbnail
         */
        public void setThumbnail(Thumbnail thumbnail) {
            this.thumbnail = thumbnail;
        }

    }
}
