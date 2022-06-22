package com.example.kartyprzypominajka;

import java.sql.Time;
import android.app.Application;

public class AppData extends Application
{
    Time time_of_notifs;
    int notif_days_before_expiration;
    Card[] cards;
}

/* ustawianie danych stąd:
// set
((MyApplication) this.getApplication()).setSomeVariable("foo");

// get
String s = ((MyApplication) this.getApplication()).getSomeVariable();
 */
