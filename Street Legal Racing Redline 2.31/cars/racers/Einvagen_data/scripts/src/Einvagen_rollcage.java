package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Einvagen_rollcage extends RollBar
{
	public Einvagen_rollcage( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM rollcage";

		description = "A strong rollcage made of carbon fiber, finished in a shiny paintable surface. It protects the driver from being hurt badly in many usual racing collisions.";

		value = tHUF2USD(1920.1);
		brand_new_prestige_value = 111.07;
		setMaxWear(kmToMaxWear(500000.0));
	}
}
