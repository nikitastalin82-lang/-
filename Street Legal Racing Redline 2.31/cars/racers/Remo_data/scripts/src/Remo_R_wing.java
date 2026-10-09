package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_wing extends Wing
{
	public Remo_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo trunk wing";
		description = "Stock trunk wing for Remo models.";

		value = tHUF2USD(43.888);
		brand_new_prestige_value = 40.27;
	}
}
