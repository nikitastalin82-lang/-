package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_R_taillights_dark extends Taillights
{
	public Teg_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg dark right taillights";
		description = "Dark right taillights for Teg models.";

		value = tHUF2USD(46.521);
		brand_new_prestige_value = 28.59;
	}
}
