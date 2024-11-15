package model_project;

import java.io.File;

public class AlberoBinarioSingleton {

    private static AlberoBinarioSingleton instance;
    private AlberoBinarioSingleton() {}

    public static AlberoBinarioSingleton getInstance() {
        if (instance == null) {
            instance = new AlberoBinarioSingleton();
        }
        return instance;
    }

    public void addFile(String path, File File){

    }

    public void removeFile(String path){

    }

    public String searchFile(String path){
        return null;
    }

    public void printFileSystem(){

    }


}
