package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_trunk extends Trunk
{
	public Codrac_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac trunk";
		description = "Stock trunk for Codrac models.";

		value = tHUF2USD(54.016);
		brand_new_prestige_value = 19.63;
	}
}
