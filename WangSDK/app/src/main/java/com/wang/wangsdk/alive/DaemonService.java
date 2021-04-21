package com.wang.wangsdk.alive;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.wang.wangsdk.alive.services.BackgroundService;

public class DaemonService extends BackgroundService {
    public static final void start(Context context) {
        try {
            DaemonService.enqueueWork(context, DaemonService.class, 1101, new Intent());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    @Override
    protected void onHandleWork(@NonNull Intent intent) {

    }

    @Override
    protected boolean isWorkComplete() {
        return false;
    }

    @Override
    protected long getMaxWaitTime() {
        return 10 * 1000;
    }
}
