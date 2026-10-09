package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_taillights_dark extends Taillights
{
	public Badge_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge dark right taillights";
		description = "Dark right taillights for Badge models.";

		value = tHUF2USD(65.722);
		brand_new_prestige_value = 35.82;
	}
}
