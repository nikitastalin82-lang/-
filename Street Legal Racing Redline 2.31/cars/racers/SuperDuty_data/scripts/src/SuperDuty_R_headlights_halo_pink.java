package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class SuperDuty_R_headlights_halo_pink extends Headlights
{
	public SuperDuty_R_headlights_halo_pink( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Hauler's SuperDuty right halogen pink headlights";

		description = "The halo pink right side headlights for the SuperDuty family. A dual design halogen headlight with 40W city bulbs and 45W for the highway."; // easter egg:LRHL-500-750 on the back side of the mesh //

		value = tHUF2USD(161.083);
		brand_new_prestige_value = 57.11;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
