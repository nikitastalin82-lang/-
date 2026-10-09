package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Furrano_trunk extends Trunk
{
	public Furrano_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Furrano trunk";
		description = "Stock trunk for Furrano models.";
		brand_new_prestige_value = 29.44;

		value = tHUF2USD(144.113);
	}
}