package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_R_taillights_dark extends Taillights
{
	public Remo_R_taillights_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo dark right taillights";
		description = "Dark right taillights for Remo models.";

		value = tHUF2USD(68.043);
		brand_new_prestige_value = 24.25;
	}
}
