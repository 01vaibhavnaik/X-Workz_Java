package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.IPL;
import com.xworkz.isarelation.Internal.Tournament;

public class Betting {
    public void bet(Tournament tournament){
    tournament.declareWinner();
    tournament.organize();
    tournament.teamsParticipate();

    if (tournament instanceof IPL){
        IPL ipl=(IPL) tournament;
        ipl.dream11();
    }
    }
}
