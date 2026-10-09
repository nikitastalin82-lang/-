package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_wing extends Wing
{
	public ST9_R_wing( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 trunk wing";
		description = "Stock trunk wing for ST9 models.";

		value = tHUF2USD(69.841);
		brand_new_prestige_value = 60.40;

	}
}
