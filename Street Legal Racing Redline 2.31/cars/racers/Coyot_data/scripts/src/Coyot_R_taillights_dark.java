package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_R_taillights_dark extends Taillights
{
	public Coyot_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot dark right taillights";
		description = "Dark right taillights for Coyot models.";

		value = tHUF2USD(46.521);
		brand_new_prestige_value = 30.04;
	}
}
