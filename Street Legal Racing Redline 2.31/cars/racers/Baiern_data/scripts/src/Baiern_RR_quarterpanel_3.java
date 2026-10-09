package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_RR_quarterpanel_3 extends Quarterpanel
{
	public Baiern_RR_quarterpanel_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM rear right quarterpanel";

		description = "The reat right quarterpanel of the CoupeSport DTM. It is made of carbon fiber for weight reduction. The DTM quarterpanel has got a wider airduct and a rear lights defence.";

		value = tHUF2USD(4452.1);
		brand_new_prestige_value = 80.0;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
