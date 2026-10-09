package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class MC_L_taillights_dark extends Taillights
{
	public MC_L_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "MC dark left taillights";
		description = "";
		brand_new_prestige_value = 57.11;

		value = tHUF2USD(37.579);
	}
}
