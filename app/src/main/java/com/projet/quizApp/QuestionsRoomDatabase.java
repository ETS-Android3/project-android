package com.projet.quizApp;


import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Questions.class},version = 5)
public abstract class QuestionsRoomDatabase extends RoomDatabase {


    private static QuestionsRoomDatabase INSTANCE;


    public abstract QuestionsDao wordDao();



    public static synchronized QuestionsRoomDatabase getInstance(final Context context){

        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    QuestionsRoomDatabase.class,"questions_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(RoomDBCallback)
                    .build();
        }

        return INSTANCE;
    }

    private static Callback RoomDBCallback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            new PopulateDbAsyncTask(INSTANCE).execute();

        }
    };


    private static class PopulateDbAsyncTask extends AsyncTask<Void,Void,Void>{


        private QuestionsDao wordDao;


        private PopulateDbAsyncTask(QuestionsRoomDatabase db)
        {
            wordDao = db.wordDao();
        }
        @Override
        protected Void doInBackground(Void... voids) {



            wordDao.insert(new Questions(" Java Source Code is compiled into ______________.",".Obj","Source Code","Bytecode",".Exe","Bytecode","Java"));
            wordDao.insert(new Questions(" Enums were introduced in?","Java 4.0","Java 8.0","Java 5.0","Java 6.0","Java 5.0","Java"));
            wordDao.insert(new Questions(" Which of the following is used to interpret and execute Java Applet Classes hosted by HTML.","appletviewer","appletwatcher","appletshow","appletscreen","appletviewer","Java"));
            wordDao.insert(new Questions(" Java is case sensitive?","True","False","Depends On Compiler","May be true or false","True","Java"));
            wordDao.insert(new Questions(" Which of the following is not a keyword in Java.","assert","boolean","abstract","finalize","finalize","Java"));
            wordDao.insert(new Questions(" Which of the following is not a keyword in Java.","transient","instanceof","enum","strictfp","enum","Java"));
            wordDao.insert(new Questions(" All Java components require names. Names used for classes, variables, and methods are called?","Variables","identifiers","Access Modifiers","Java Modifiers","identifiers","Java"));
            wordDao.insert(new Questions(" Default, public , protected, private are?","Access Modifier","Non-access Modifiers","Both A and B","It's variable","Access Modifier","Java"));
            wordDao.insert(new Questions(" jar stands for:","Java Application Runner","Java Archive","Java Archive Runner","None of these","Java Archive","Java"));
            wordDao.insert(new Questions(" How to compile java code in command prompt?","javac filename.java","java filename.java","javac filename","java filename","javac filename.java","Java"));
            wordDao.insert(new Questions("Single line comment starts with _________ in Java.","/**","//","/*","None of these","//","Java"));



            wordDao.insert(new Questions("Category : Dart : Which is the fastest memory in computer","RAM","ROM","Cache","Hard Drive","Cache","Dart"));
            wordDao.insert(new Questions("Category : Dart : What is the name for a webpage address? ","Directory","Protocol","URL","Domain","URL","Dart"));
            wordDao.insert(new Questions("Category : Dart : Which of the following is not an input device?","Microphone","Keyboard","Mozilla firefox","Mouse","Mozilla firefox","Dart"));
            wordDao.insert(new Questions("Category : Dart : Which is the fastest memory in computer","RAM","ROM","Cache","Hard Drive","Cache","Dart"));
            wordDao.insert(new Questions("Category : Dart : What is the name for a webpage address? ","Directory","Protocol","URL","Domain","URL","Dart"));
            wordDao.insert(new Questions("Category : Dart : Which of the following is not an input device?","Microphone","Keyboard","Mozilla firefox","Mouse","Mozilla firefox","Dart"));
            wordDao.insert(new Questions("Category : Dart : Which is the fastest memory in computer","RAM","ROM","Cache","Hard Drive","Cache","Dart"));
            wordDao.insert(new Questions("Category : Dart : What is the name for a webpage address? ","Directory","Protocol","URL","Domain","URL","Dart"));
            wordDao.insert(new Questions("Category : Dart : Which of the following is not an input device?","Microphone","Keyboard","Mozilla firefox","Mouse","Mozilla firefox","Dart"));


            wordDao.insert(new Questions("Category : Kotlin : Kotlin is developed by?","Google  ","JetBrains","Microsoft","Adobe","JetBrains","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : Which of following is used to handle null exceptions in Kotlin? ","Range","Sealed Class","Elvis Operator","Lambda function","Elvis Operator","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : Which file extension is used to save Kotlin files",".java",".kot",".kt or .kts",".android","M.kt or .kts","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : All classes in Kotlin classes are by default?","public","final","sealed","abstract","final","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : Which of the followings constructors are available in Kotlin? ","Primary constructor","Secondary constructor","Both 1 & 2","None of the above","Both 1 & 2","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : Which of the following extension methods are used in Kotlin?","Read texts () & Headlines ()","Buffer reader ()","Read each line ()","All of the above","All of the above","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : There are two types of constructors in Kotlin which are-","Primary & Secondary constructor","Default & No-arg constructor","Parameterized & constant Constructor","None of the above","Primary & Secondary constructor","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : Which of the following is not the basic data types in Kotlin? ","Numbers","Strings","Arrays","Lists","Lists","Kotlin"));
            wordDao.insert(new Questions("Category : Kotlin : Which of following option is used to handle null exceptions in Kotlin?","Range","Elvis Operator","Sealed Class","Lambda function","Elvis Operator","Kotlin"));

            wordDao.insert(new Questions("Category : Flutter : Which of the following is true regarding Flutter?","Flutter is a UI toolkit for creating fast, beautiful, natively compiled mobile applications","Flutter use one programming language and a single codebase","Flutter is free and open-source.","All of the above","All of the above","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : Flutter developed by? ","Oracle","Facebook","Google","IBM","Google","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : Flutter is mainly optimized for 2D mobile apps that can run on?","Android","iOS","Both A and B","None of the above","Both A and B","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : It is very necessary to learn Dart language for building Flutter application?","Yes","No","Can be yes or no","Can not say","Yes","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : A widget that allows us to refresh the screen is called a: ","Stateless widgets","Stateful widget","Statebuild widget","All of the above","Stateful widget","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : The examples of the Stateless widget are?","Text","Row","Column","All of the above","All of the above","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : pubspec.yaml file does not contain?","Project general settings","Project dependencies","Project language","Project assets","Project language","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : Which of the following are the advantages of Flutter? ","Cross-platform Development","Faster Development","Minimal code","All of the above","All of the above","Flutter"));
            wordDao.insert(new Questions("Category : Flutter : Which of the following takes more time to compile and update the app?","Hot Reload","Hot Restart","Cold Reload","Depends on Compiler","Hot Restart","Flutter"));

            wordDao.insert(new Questions("Category : Javascript : Which is the fastest memory in computer","RAM","ROM","Cache","Hard Drive","Cache","JavaScript"));
            wordDao.insert(new Questions("Category : Javascript : What is the name for a webpage address? ","Directory","Protocol","URL","Domain","URL","JavaScript"));
            wordDao.insert(new Questions("Category : Javascript : Which of the following is not an input device?","Microphone","Keyboard","Mozilla firefox","Mouse","Mozilla firefox","JavaScript"));
            wordDao.insert(new Questions("Category : Javascript : Which is the fastest memory in computer","RAM","ROM","Cache","Hard Drive","Cache","JavaScript"));
            wordDao.insert(new Questions("Category : Javascript : What is the name for a webpage address? ","Directory","Protocol","URL","Domain","URL","Javascript"));
            wordDao.insert(new Questions("Category : Javascript : Which of the following is not an input device?","Microphone","Keyboard","Mozilla firefox","Mouse","Mozilla firefox","JavaScript"));
            wordDao.insert(new Questions("Category : Javascript : Which is the fastest memory in computer","RAM","ROM","Cache","Hard Drive","Cache","JavaScript"));
            wordDao.insert(new Questions("Category : Javascript : What is the name for a webpage address? ","Directory","Protocol","URL","Domain","URL","JavaScript"));
            wordDao.insert(new Questions("Category : Javascript : Which of the following is not an input device?","Microphone","Keyboard","Mozilla firefox","Mouse","Mozilla firefox","JavaScript"));

            return null;
        }
    }


}
