package com.example.kartyprzypominajka;

import java.sql.Time;
import java.time.LocalTime;

public class Card
{
    private String name;
    private int min_value_to_spend;
    private int min_use_times;
    private int exp_day; // zawsze trzeba zapłacić do konkretnego dnia miesiąca, jeśli -1 to do końca miesiąca
    private Currency currency;
    private int days_before_exp; // przysyłaj powiadomienia na tyle dni przed końcem okresu rozliczeniowego
    private Time[] time_of_notifs; // godzina przysyłania powiadomień
    private NotificationData[] notifications;
    private CardPayment[] payments; // tylko z aktualnego okresu rozliczeniowego
}
