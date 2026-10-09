package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_trunk extends Trunk
{
	public Naxas_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas trunk";
		description = "Stock trunk for Naxas models.";

		value = tHUF2USD(180.194);
		brand_new_prestige_value = 31.90;
	}
}
