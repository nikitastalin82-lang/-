package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_trunk extends Trunk
{
	public Remo_trunk( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo trunk";
		description = "Stock trunk for Remo models.";

		value = tHUF2USD(56.126);
		brand_new_prestige_value = 17.17;
	}
}
