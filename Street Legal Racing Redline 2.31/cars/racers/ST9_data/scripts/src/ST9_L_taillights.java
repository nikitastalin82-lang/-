package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_taillights extends Taillights
{
	public ST9_L_taillights( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 left taillights";
		description = "Stock left taillights for ST9 models.";

		value = tHUF2USD(98.748);
		brand_new_prestige_value = 30.38;
	}
}
