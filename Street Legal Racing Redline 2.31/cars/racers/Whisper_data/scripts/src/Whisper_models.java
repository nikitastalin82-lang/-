package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;

public class Whisper_models extends Chassis
{
	static int	MODEL_C555		= 6;
	static int	MODEL_D8800		= 7;
	static int	MODEL_R1		= 8;
	static int	MODEL_Q1000XL	= 9;

	public Whisper_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_PRIME;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}