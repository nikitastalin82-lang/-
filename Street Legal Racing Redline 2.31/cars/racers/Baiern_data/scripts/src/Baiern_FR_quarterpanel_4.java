package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_FR_quarterpanel_4 extends Quarterpanel
{
	public Baiern_FR_quarterpanel_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM front right quarterpanel";

		description = "The front right quarterpanel of the CoupeSport DTM. It is made of carbon fiber for weight reduction. The DTM quarterpanel has got a wider airduct and a rear headlight defence.";

		value = tHUF2USD(4747.5);
		brand_new_prestige_value = 85.0;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
