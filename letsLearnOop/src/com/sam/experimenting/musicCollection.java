package com.sam.experimenting;

import java.util.ArrayList;

public class musicCollection {

    ArrayList<FavMusic> latesthit;

    public musicCollection(){
        latesthit = new ArrayList<FavMusic>();
    }

    public musicCollection(ArrayList<FavMusic> latesthit) {
        this.latesthit = latesthit;
    }

    public void addMusic(FavMusic my_fav_music){
        latesthit.add(my_fav_music);
    }

    public void removeMusic(FavMusic my_fav_music){
        latesthit.remove(my_fav_music);
    }

    public ArrayList<FavMusic> getLatesthit() {
        return latesthit;
    }

    static class FavMusic{
        private String title;
        private String singerName;

        public FavMusic(String title, String singerName) {
            this.title = title;
            this.singerName = singerName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSingerName() {
            return singerName;
        }

        public void setSingerName(String singerName) {
            this.singerName = singerName;
        }
    }

    public static void main(String[] args) {
        musicCollection myMusic = new musicCollection();

        FavMusic hitOne = new FavMusic("alone" , "ava max");
        FavMusic hitTwo = new FavMusic("champions","nas daily");

        myMusic.addMusic(hitOne);
        myMusic.addMusic(hitTwo);

        System.out.println("These are the latest hits of the music outthere: ");

        for(FavMusic play_music: myMusic.getLatesthit()){
            System.out.println(play_music.getSingerName() + " , and this singer also won the best singer award of 2022 and the song he sang was " + play_music.getTitle()  );
        }

        myMusic.removeMusic(hitOne);

        System.out.println("After removing the song one: ");

        for(FavMusic play_music: myMusic.getLatesthit()){
            System.out.println(play_music.getSingerName() + " , and this singer also won the best singer award of 2022 and the song he sang was " + play_music.getTitle()  );
        }

    }
}



