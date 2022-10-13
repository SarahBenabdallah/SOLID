package com.directi.training.dip.exercice_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    static IDatabase db;
    static IEncoder encodingModule;
    public static void main(String[] args) throws IOException
    {
        db  = new MyDatabase();
        encodingModule  = new EncodingModule(db);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}