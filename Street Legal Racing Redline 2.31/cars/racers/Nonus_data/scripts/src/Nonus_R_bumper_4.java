package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Nonus_R_bumper_4 extends Bumper
{
	public Nonus_R_bumper_4( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Nonus DTM rear bumper";
		description = "A rear bumper for the Nonus DTM. It's wider than ordinary one and it has enhanced aerodynamics designed for tough racing conditions.";
		brand_new_prestige_value = 71.40;

		value = tHUF2USD(2141.65);
	}
}
