package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_taillights_dark extends Taillights
{
	public ST9_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 dark right taillights";
		description = "Dark right taillights for ST9 models.";

		value = tHUF2USD(100.548);
		brand_new_prestige_value = 34.38;
	}
}
