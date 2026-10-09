package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Naxas_R_wing extends Wing
{
	public Naxas_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas trunk wing";
		description = "Stock trunk wing for Naxas models.";

		value = tHUF2USD(278.731);
		brand_new_prestige_value = 74.78;

	}
}
