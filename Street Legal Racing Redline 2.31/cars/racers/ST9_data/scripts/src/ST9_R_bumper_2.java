package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_bumper_2 extends Bumper
{
	public ST9_R_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 custom bumper";
		description = "Custom rear bumper for ST9 models.";

		value = tHUF2USD(230.098);
		brand_new_prestige_value = 42.30;
	}
}
