package com.viral;

public class computer
{

    private storage storage;
    private display display;

    public computer(storage storage1, display display1)
    {
        this.storage=storage1;
        this.display=display1;

        this.storage.read();
        this.display.show();
        this.storage.write();
    }

}
