package com.skuhleesi.mynihongo;

/**
 * Created by Mugen on 4/4/2017.
 */

public class AppConfig {
    private static String base_URL = "http://10.0.3.2/";		//Default configuration for WAMP - 80 is default port for WAMP and 10.0.2.2 is localhost IP in Android Emulator
    // Server user login url
    public static String URL_LOGIN = base_URL+"android_login_api/login.php";

    // Server user register url
    public static String URL_REGISTER = base_URL+"android_login_api/register.php";
}