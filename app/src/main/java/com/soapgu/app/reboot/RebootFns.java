package com.soapgu.app.reboot;

import android.content.Context;
import android.content.Intent;

public abstract class RebootFns {
    public static void rebootByBroadcast(Context context){
        Intent intent = new Intent("android.intent.action.REBOOT");
        intent.putExtra("nowait", 1);
        intent.putExtra("interval", 1);
        intent.putExtra("window", 0);
        context.startActivity(intent);
    }

    public static void rebootByShell(){
        ShellFns.excuteSlient( "reboot" );
    }
}
