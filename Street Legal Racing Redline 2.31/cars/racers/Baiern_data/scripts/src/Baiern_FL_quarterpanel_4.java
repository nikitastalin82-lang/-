package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_FL_quarterpanel_4 extends Quarterpanel
{
	public Baiern_FL_quarterpanel_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM front left quarterpanel";

		description = "The front left quarterpanel of the CoupeSport DTM. It is made of carbon fiber for weight reduction. The DTM quarterpanel has got a modified front part to make powered headlights fit in it.";

		value = tHUF2USD(4747.5);
		brand_new_prestige_value = 85.0;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
