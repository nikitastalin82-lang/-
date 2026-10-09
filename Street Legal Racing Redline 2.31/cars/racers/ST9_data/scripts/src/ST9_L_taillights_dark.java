package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_L_taillights_dark extends Taillights
{
	public ST9_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 dark left taillights";
		description = "Dark left taillights for ST9 models.";

		value = tHUF2USD(100.548);
		brand_new_prestige_value = 34.38;
	}
}
