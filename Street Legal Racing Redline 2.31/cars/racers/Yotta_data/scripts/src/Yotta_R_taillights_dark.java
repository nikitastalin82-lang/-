package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_taillights_dark extends Taillights
{
	public Yotta_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta dark right taillights";
		description = "Dark right taillights for Yotta models.";

		value = tHUF2USD(68.043);
		brand_new_prestige_value = 35.82;
	}
}
