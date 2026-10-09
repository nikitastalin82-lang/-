package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_F_bumper_3 extends Bumper
{
	public ST9_F_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 tuner front bumper";
		description = "Stylized front bumper for ST9 models.";

		value = tHUF2USD(201.716);
		brand_new_prestige_value = 60.86;
	}
}
