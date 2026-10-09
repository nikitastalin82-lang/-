package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_sideskirt_3 extends Sideskirt
{
	public Axis_R_sideskirt_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis ZX360 right sideskirt";
		description = "The stock right sideskirt for Axis ZX360.";

		value = tHUF2USD(173.02);
		brand_new_prestige_value = 57.96;
	}
}
