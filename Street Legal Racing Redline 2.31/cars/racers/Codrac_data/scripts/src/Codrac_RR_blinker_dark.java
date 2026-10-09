package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_RR_blinker_dark extends Taillights
{
	public Codrac_RR_blinker_dark( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac dark rear right blinker";
		description = "Dark right taillight component for Codrac models.";

		value = tHUF2USD(67.621);
		brand_new_prestige_value = 28.14;
	}
}
