package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_R_taillights_dark extends Taillights
{
	public Axis_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis dark right taillights";
		description = "Dark right taillights for Axis models.";

		value = tHUF2USD(57.071);
		brand_new_prestige_value = 31.01;
	}
}
