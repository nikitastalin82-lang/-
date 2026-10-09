package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_mirror_2 extends Mirror
{
	public Axis_R_mirror_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis ZX360 right mirror";
		description = "The stock right mirror for Axis ZX360 models.";

		value = tHUF2USD(71.529);
		brand_new_prestige_value = 35.43;
	}
}
