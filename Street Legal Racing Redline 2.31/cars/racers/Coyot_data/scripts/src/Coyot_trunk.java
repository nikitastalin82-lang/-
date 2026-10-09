package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_trunk extends Trunk
{
	public Coyot_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot trunk";
		description = "Stock trunk for Coyot models.";

		value = tHUF2USD(54.016);
		brand_new_prestige_value = 22.08;
	}
}
