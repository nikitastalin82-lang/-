package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class MC_R_taillights_dark extends Taillights
{
	public MC_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "MC dark right taillights";
		description = "";
		brand_new_prestige_value = 57.11;

		value = tHUF2USD(37.579);
	}
}
