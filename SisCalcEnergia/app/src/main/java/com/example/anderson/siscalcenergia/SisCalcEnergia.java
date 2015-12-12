package com.example.anderson.siscalcenergia;

import android.app.Application;
import android.util.Log;

public class SisCalcEnergia extends Application {
    private static String TAG = "SistemaGerenciamentoConsumoEnergia";
    private static SisCalcEnergia instance = null;

    // Retornando a instancia da aplicação
    private static SisCalcEnergia getInstance (){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, TAG + " onCreate");
        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG, TAG + " onTerminate");
    }
}