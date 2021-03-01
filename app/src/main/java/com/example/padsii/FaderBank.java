package com.example.padsii;

public class FaderBank {
    private Fader myFaders[];
    private int Bank;
    private Pad associatedPads[];

    public FaderBank(MainActivity ac, PadBank pb){
        myFaders = new Fader[8];
        Pad [] aP = pb.getMyPads();
        myFaders[0] = new Fader(ac.findViewById(R.id.fader1), aP[0]);
        myFaders[1] = new Fader(ac.findViewById(R.id.fader2), aP[1]);
        myFaders[2] = new Fader(ac.findViewById(R.id.fader3), aP[2]);
        myFaders[3] = new Fader(ac.findViewById(R.id.fader4), aP[3]);
        myFaders[4] = new Fader(ac.findViewById(R.id.fader5), aP[4]);
        myFaders[5] = new Fader(ac.findViewById(R.id.fader6), aP[5]);
        myFaders[6] = new Fader(ac.findViewById(R.id.fader7), aP[6]);
        myFaders[7] = new Fader(ac.findViewById(R.id.fader8), aP[7]);       ///!!!!!!!
    }

    public void reset(){
        for(int i = 0; i < 8; i++){
            myFaders[i].setStatus(0);
        }
    }

}
