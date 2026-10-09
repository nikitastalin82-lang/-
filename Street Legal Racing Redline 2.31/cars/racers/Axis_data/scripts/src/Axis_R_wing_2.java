package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_wing_2 extends Wing
{
	public Axis_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis ZX360 trunk wing";
		description = "The stock trunk wing for Axis ZX360 models.";

		value = tHUF2USD(48.741);
		brand_new_prestige_value = 69.90;

	}
}
