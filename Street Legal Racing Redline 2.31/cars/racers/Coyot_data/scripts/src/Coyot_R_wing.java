package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_wing extends Wing
{
	public Coyot_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot stock trunk wing";
		description = "Stock trunk wing for Coyot models.";

		value = tHUF2USD(79.547);
		brand_new_prestige_value = 51.77;

	}
}
