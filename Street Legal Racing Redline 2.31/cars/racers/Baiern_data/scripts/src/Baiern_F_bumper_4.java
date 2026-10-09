package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_F_bumper_4 extends Bumper
{
	public Baiern_F_bumper_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport DTM front bumper";

		description = "The front bumper of the CoupeSport DTM. It is made of carbon fiber for weight reduction. \n It supports an integrated splitter to create downforce at the front. It has also gained wide spaces for engine cooling protected with a grill.";

		value = tHUF2USD(3924.6);
		brand_new_prestige_value = 65.0;
		setMaxWear(kmToMaxWear(200000.0));
	}
}
