package com.example.myquotes;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.concurrent.ThreadLocalRandom;

public class QuoteServer {

 String[]  getQuotes() {

     String[] quotes = new String[]  { "Love For All, Hatred For None./",
           " Change the world by being yourself. ",
     "Every moment is a fresh beginning." ,
     "Die with memories, not dreams.",
     "Aspire to inspire before we expire.",
     "Everything you can imagine is real.",
     "Simplicity is the ultimate sophistication.",
     "Whatever you do, do it well.",
     "What we think, we become."};

 return quotes;

 }

 @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
 String getRandomQuote() {

     String quote;
     int  quotesArryLen = getQuotes().length;
     int randomNum = ThreadLocalRandom.current().nextInt(quotesArryLen);

     quote =getQuotes()[randomNum];
     return quote;
 }

}
