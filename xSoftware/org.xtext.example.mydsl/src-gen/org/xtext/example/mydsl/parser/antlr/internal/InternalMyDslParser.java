package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'('", "'PK,mockType'", "'mockType'", "')'", "'['", "']'", "'Entity'", "'{'", "'}'", "'URL'", "'/'", "'?${'", "'/:{'", "'SimpleEntity'", "'Response'", "'Type'", "'Request'", "'string'", "'int'", "'boolean'", "'Mapping'", "'value'", "'Asercion'", "'elemento1'", "'elemento2'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_EQUAL=4;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=5;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Api";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:65:1: entryRuleApi returns [EObject current=null] : iv_ruleApi= ruleApi EOF ;
    public final EObject entryRuleApi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApi = null;


        try {
            // InternalMyDsl.g:65:44: (iv_ruleApi= ruleApi EOF )
            // InternalMyDsl.g:66:2: iv_ruleApi= ruleApi EOF
            {
             newCompositeNode(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApi=ruleApi();

            state._fsp--;

             current =iv_ruleApi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalMyDsl.g:72:1: ruleApi returns [EObject current=null] : ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        EObject lv_entidades_5_0 = null;

        EObject lv_primitivetypes_6_0 = null;

        EObject lv_serviciosRest_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* )
            // InternalMyDsl.g:80:3: () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )*
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApiAccess().getApiAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getApiURLKeyword_1());
            		
            this_EQUAL_2=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_2, grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2());
            		
            // InternalMyDsl.g:95:3: ( (lv_url_3_0= ruleEString ) )
            // InternalMyDsl.g:96:4: (lv_url_3_0= ruleEString )
            {
            // InternalMyDsl.g:96:4: (lv_url_3_0= ruleEString )
            // InternalMyDsl.g:97:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApiRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalMyDsl.g:118:3: ( (lv_entidades_5_0= ruleEntidad ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:119:4: (lv_entidades_5_0= ruleEntidad )
            	    {
            	    // InternalMyDsl.g:119:4: (lv_entidades_5_0= ruleEntidad )
            	    // InternalMyDsl.g:120:5: lv_entidades_5_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_entidades_5_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:137:3: ( (lv_primitivetypes_6_0= rulePrimitiveType ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=31 && LA2_0<=33)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:138:4: (lv_primitivetypes_6_0= rulePrimitiveType )
            	    {
            	    // InternalMyDsl.g:138:4: (lv_primitivetypes_6_0= rulePrimitiveType )
            	    // InternalMyDsl.g:139:5: lv_primitivetypes_6_0= rulePrimitiveType
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_primitivetypes_6_0=rulePrimitiveType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"primitivetypes",
            	    						lv_primitivetypes_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.PrimitiveType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:156:3: ( (lv_serviciosRest_7_0= ruleServicioRest ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=53 && LA3_0<=56)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:157:4: (lv_serviciosRest_7_0= ruleServicioRest )
            	    {
            	    // InternalMyDsl.g:157:4: (lv_serviciosRest_7_0= ruleServicioRest )
            	    // InternalMyDsl.g:158:5: lv_serviciosRest_7_0= ruleServicioRest
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_serviciosRest_7_0=ruleServicioRest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"serviciosRest",
            	    						lv_serviciosRest_7_0,
            	    						"org.xtext.example.mydsl.MyDsl.ServicioRest");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleEntidad"
    // InternalMyDsl.g:179:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalMyDsl.g:179:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalMyDsl.g:180:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalMyDsl.g:186:1: ruleEntidad returns [EObject current=null] : (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleEntity_0 = null;

        EObject this_MockarooEntity_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:192:2: ( (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) )
            // InternalMyDsl.g:193:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            {
            // InternalMyDsl.g:193:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:194:3: this_SimpleEntity_0= ruleSimpleEntity
                    {

                    			newCompositeNode(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleEntity_0=ruleSimpleEntity();

                    state._fsp--;


                    			current = this_SimpleEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:203:3: this_MockarooEntity_1= ruleMockarooEntity
                    {

                    			newCompositeNode(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MockarooEntity_1=ruleMockarooEntity();

                    state._fsp--;


                    			current = this_MockarooEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:215:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalMyDsl.g:215:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalMyDsl.g:216:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:222:1: rulePrimitiveType returns [EObject current=null] : (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_MyNumeric_0 = null;

        EObject this_MyString_1 = null;

        EObject this_MyBoolean_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:228:2: ( (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean ) )
            // InternalMyDsl.g:229:2: (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean )
            {
            // InternalMyDsl.g:229:2: (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 33:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:230:3: this_MyNumeric_0= ruleMyNumeric
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getMyNumericParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyNumeric_0=ruleMyNumeric();

                    state._fsp--;


                    			current = this_MyNumeric_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:239:3: this_MyString_1= ruleMyString
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getMyStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyString_1=ruleMyString();

                    state._fsp--;


                    			current = this_MyString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:248:3: this_MyBoolean_2= ruleMyBoolean
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getMyBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyBoolean_2=ruleMyBoolean();

                    state._fsp--;


                    			current = this_MyBoolean_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:260:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:260:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:261:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalMyDsl.g:267:1: ruleAtributo returns [EObject current=null] : (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoMocka_0 = null;

        EObject this_AtributoArreglo_1 = null;

        EObject this_AtributoSimple_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:273:2: ( (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) )
            // InternalMyDsl.g:274:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            {
            // InternalMyDsl.g:274:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_4==14) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_5==14) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 18:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 32:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_4==14) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_5==14) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

                }
                break;
            case 33:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_4==14) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA6_5 = input.LA(3);

                    if ( (LA6_5==RULE_SEMICOLON) ) {
                        alt6=3;
                    }
                    else if ( (LA6_5==14) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:275:3: this_AtributoMocka_0= ruleAtributoMocka
                    {

                    			newCompositeNode(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtributoMocka_0=ruleAtributoMocka();

                    state._fsp--;


                    			current = this_AtributoMocka_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:284:3: this_AtributoArreglo_1= ruleAtributoArreglo
                    {

                    			newCompositeNode(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtributoArreglo_1=ruleAtributoArreglo();

                    state._fsp--;


                    			current = this_AtributoArreglo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:293:3: this_AtributoSimple_2= ruleAtributoSimple
                    {

                    			newCompositeNode(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtributoSimple_2=ruleAtributoSimple();

                    state._fsp--;


                    			current = this_AtributoSimple_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleAtributoMocka"
    // InternalMyDsl.g:305:1: entryRuleAtributoMocka returns [EObject current=null] : iv_ruleAtributoMocka= ruleAtributoMocka EOF ;
    public final EObject entryRuleAtributoMocka() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoMocka = null;


        try {
            // InternalMyDsl.g:305:54: (iv_ruleAtributoMocka= ruleAtributoMocka EOF )
            // InternalMyDsl.g:306:2: iv_ruleAtributoMocka= ruleAtributoMocka EOF
            {
             newCompositeNode(grammarAccess.getAtributoMockaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoMocka=ruleAtributoMocka();

            state._fsp--;

             current =iv_ruleAtributoMocka; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoMocka"


    // $ANTLR start "ruleAtributoMocka"
    // InternalMyDsl.g:312:1: ruleAtributoMocka returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoMocka() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_primaryKey_3_0=null;
        Token this_EQUAL_4=null;
        Token otherlv_6=null;
        Token this_EQUAL_7=null;
        Token otherlv_9=null;
        Token this_SEMICOLON_10=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        Enumerator lv_mockType_5_0 = null;

        Enumerator lv_mockType_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:318:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) )
            // InternalMyDsl.g:319:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:319:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            // InternalMyDsl.g:320:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON
            {
            // InternalMyDsl.g:320:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:321:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:321:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:322:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_tipo_0_0=ruleTipoAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoAtributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:339:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:340:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:340:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:341:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoMockaAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:358:3: (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' )
            // InternalMyDsl.g:359:4: otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')'
            {
            otherlv_2=(Token)match(input,14,FOLLOW_10); 

            				newLeafNode(otherlv_2, grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMyDsl.g:363:4: ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:364:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:364:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:365:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) )
                    {
                    // InternalMyDsl.g:365:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) )
                    // InternalMyDsl.g:366:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    {
                    // InternalMyDsl.g:366:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    // InternalMyDsl.g:367:8: lv_primaryKey_3_0= 'PK,mockType'
                    {
                    lv_primaryKey_3_0=(Token)match(input,15,FOLLOW_3); 

                    								newLeafNode(lv_primaryKey_3_0, grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getAtributoMockaRule());
                    								}
                    								setWithLastConsumed(current, "primaryKey", true, "PK,mockType");
                    							

                    }


                    }

                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_11); 

                    						newLeafNode(this_EQUAL_4, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1());
                    					
                    // InternalMyDsl.g:383:6: ( (lv_mockType_5_0= ruleMockaroo ) )
                    // InternalMyDsl.g:384:7: (lv_mockType_5_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:384:7: (lv_mockType_5_0= ruleMockaroo )
                    // InternalMyDsl.g:385:8: lv_mockType_5_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0());
                    							
                    pushFollow(FOLLOW_12);
                    lv_mockType_5_0=ruleMockaroo();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
                    								}
                    								set(
                    									current,
                    									"mockType",
                    									lv_mockType_5_0,
                    									"org.xtext.example.mydsl.MyDsl.Mockaroo");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:404:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:404:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:405:6: otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    						newLeafNode(otherlv_6, grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0());
                    					
                    this_EQUAL_7=(Token)match(input,RULE_EQUAL,FOLLOW_11); 

                    						newLeafNode(this_EQUAL_7, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1());
                    					
                    // InternalMyDsl.g:413:6: ( (lv_mockType_8_0= ruleMockaroo ) )
                    // InternalMyDsl.g:414:7: (lv_mockType_8_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:414:7: (lv_mockType_8_0= ruleMockaroo )
                    // InternalMyDsl.g:415:8: lv_mockType_8_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0());
                    							
                    pushFollow(FOLLOW_12);
                    lv_mockType_8_0=ruleMockaroo();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getAtributoMockaRule());
                    								}
                    								set(
                    									current,
                    									"mockType",
                    									lv_mockType_8_0,
                    									"org.xtext.example.mydsl.MyDsl.Mockaroo");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_5); 

            				newLeafNode(otherlv_9, grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2());
            			

            }

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoMocka"


    // $ANTLR start "entryRuleAtributoArreglo"
    // InternalMyDsl.g:447:1: entryRuleAtributoArreglo returns [EObject current=null] : iv_ruleAtributoArreglo= ruleAtributoArreglo EOF ;
    public final EObject entryRuleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoArreglo = null;


        try {
            // InternalMyDsl.g:447:56: (iv_ruleAtributoArreglo= ruleAtributoArreglo EOF )
            // InternalMyDsl.g:448:2: iv_ruleAtributoArreglo= ruleAtributoArreglo EOF
            {
             newCompositeNode(grammarAccess.getAtributoArregloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoArreglo=ruleAtributoArreglo();

            state._fsp--;

             current =iv_ruleAtributoArreglo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoArreglo"


    // $ANTLR start "ruleAtributoArreglo"
    // InternalMyDsl.g:454:1: ruleAtributoArreglo returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_4=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:460:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalMyDsl.g:461:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:461:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalMyDsl.g:462:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_nombre_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON
            {
            // InternalMyDsl.g:462:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:463:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:463:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:464:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_tipo_0_0=ruleTipoAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoArregloRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoAtributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:489:3: ( (lv_nombre_3_0= ruleEString ) )
            // InternalMyDsl.g:490:4: (lv_nombre_3_0= ruleEString )
            {
            // InternalMyDsl.g:490:4: (lv_nombre_3_0= ruleEString )
            // InternalMyDsl.g:491:5: lv_nombre_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoArregloAccess().getNombreEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_nombre_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoArregloRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoArreglo"


    // $ANTLR start "entryRuleAtributoSimple"
    // InternalMyDsl.g:516:1: entryRuleAtributoSimple returns [EObject current=null] : iv_ruleAtributoSimple= ruleAtributoSimple EOF ;
    public final EObject entryRuleAtributoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoSimple = null;


        try {
            // InternalMyDsl.g:516:55: (iv_ruleAtributoSimple= ruleAtributoSimple EOF )
            // InternalMyDsl.g:517:2: iv_ruleAtributoSimple= ruleAtributoSimple EOF
            {
             newCompositeNode(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoSimple=ruleAtributoSimple();

            state._fsp--;

             current =iv_ruleAtributoSimple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributoSimple"


    // $ANTLR start "ruleAtributoSimple"
    // InternalMyDsl.g:523:1: ruleAtributoSimple returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoSimple() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_2=null;
        Enumerator lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:529:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalMyDsl.g:530:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:530:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalMyDsl.g:531:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_nombre_1_0= ruleEString ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {
            // InternalMyDsl.g:531:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:532:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:532:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:533:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_tipo_0_0=ruleTipoAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoSimpleRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoAtributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:550:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:551:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:551:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:552:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoSimpleAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoSimpleRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributoSimple"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:577:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:577:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:578:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:584:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:590:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:591:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:591:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:592:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:600:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMockarooEntity"
    // InternalMyDsl.g:611:1: entryRuleMockarooEntity returns [EObject current=null] : iv_ruleMockarooEntity= ruleMockarooEntity EOF ;
    public final EObject entryRuleMockarooEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMockarooEntity = null;


        try {
            // InternalMyDsl.g:611:55: (iv_ruleMockarooEntity= ruleMockarooEntity EOF )
            // InternalMyDsl.g:612:2: iv_ruleMockarooEntity= ruleMockarooEntity EOF
            {
             newCompositeNode(grammarAccess.getMockarooEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMockarooEntity=ruleMockarooEntity();

            state._fsp--;

             current =iv_ruleMockarooEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMockarooEntity"


    // $ANTLR start "ruleMockarooEntity"
    // InternalMyDsl.g:618:1: ruleMockarooEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) ;
    public final EObject ruleMockarooEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:624:2: ( (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:625:2: (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:625:2: (otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            // InternalMyDsl.g:626:3: otherlv_0= 'Entity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMockarooEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:630:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:631:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:631:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:632:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMockarooEntityAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMockarooEntityRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:653:3: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=31 && LA9_0<=33)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:654:4: (lv_atributos_3_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:654:4: (lv_atributos_3_0= ruleAtributo )
            	    // InternalMyDsl.g:655:5: lv_atributos_3_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_atributos_3_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMockarooEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMockarooEntity"


    // $ANTLR start "entryRuleServicioRest"
    // InternalMyDsl.g:680:1: entryRuleServicioRest returns [EObject current=null] : iv_ruleServicioRest= ruleServicioRest EOF ;
    public final EObject entryRuleServicioRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicioRest = null;


        try {
            // InternalMyDsl.g:680:53: (iv_ruleServicioRest= ruleServicioRest EOF )
            // InternalMyDsl.g:681:2: iv_ruleServicioRest= ruleServicioRest EOF
            {
             newCompositeNode(grammarAccess.getServicioRestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServicioRest=ruleServicioRest();

            state._fsp--;

             current =iv_ruleServicioRest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServicioRest"


    // $ANTLR start "ruleServicioRest"
    // InternalMyDsl.g:687:1: ruleServicioRest returns [EObject current=null] : ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' ) ;
    public final EObject ruleServicioRest() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_EQUAL_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token this_SEMICOLON_10=null;
        Token otherlv_13=null;
        Enumerator lv_metodo_0_0 = null;

        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;

        EObject lv_parametros_7_0 = null;

        EObject lv_request_11_0 = null;

        EObject lv_response_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:693:2: ( ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:694:2: ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:694:2: ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' )
            // InternalMyDsl.g:695:3: ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}'
            {
            // InternalMyDsl.g:695:3: ( (lv_metodo_0_0= ruleTipoMetodoRest ) )
            // InternalMyDsl.g:696:4: (lv_metodo_0_0= ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:696:4: (lv_metodo_0_0= ruleTipoMetodoRest )
            // InternalMyDsl.g:697:5: lv_metodo_0_0= ruleTipoMetodoRest
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_metodo_0_0=ruleTipoMetodoRest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"metodo",
            						lv_metodo_0_0,
            						"org.xtext.example.mydsl.MyDsl.TipoMetodoRest");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:714:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:715:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:715:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:716:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getServicioRestAccess().getURLKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_18); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getServicioRestAccess().getSolidusKeyword_5());
            		
            // InternalMyDsl.g:749:3: ( (lv_url_6_0= ruleEString ) )
            // InternalMyDsl.g:750:4: (lv_url_6_0= ruleEString )
            {
            // InternalMyDsl.g:750:4: (lv_url_6_0= ruleEString )
            // InternalMyDsl.g:751:5: lv_url_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getUrlEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_url_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_6_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:768:3: ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }
                else if ( (LA10_0==24) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:769:4: ( (lv_parametros_7_0= ruleParametro ) )
            	    {
            	    // InternalMyDsl.g:769:4: ( (lv_parametros_7_0= ruleParametro ) )
            	    // InternalMyDsl.g:770:5: (lv_parametros_7_0= ruleParametro )
            	    {
            	    // InternalMyDsl.g:770:5: (lv_parametros_7_0= ruleParametro )
            	    // InternalMyDsl.g:771:6: lv_parametros_7_0= ruleParametro
            	    {

            	    						newCompositeNode(grammarAccess.getServicioRestAccess().getParametrosParametroParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_parametros_7_0=ruleParametro();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServicioRestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parametros",
            	    							lv_parametros_7_0,
            	    							"org.xtext.example.mydsl.MyDsl.Parametro");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:789:4: (otherlv_8= '/' ruleEString )
            	    {
            	    // InternalMyDsl.g:789:4: (otherlv_8= '/' ruleEString )
            	    // InternalMyDsl.g:790:5: otherlv_8= '/' ruleEString
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_4); 

            	    					newLeafNode(otherlv_8, grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1_0());
            	    				

            	    					newCompositeNode(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_7_1_1());
            	    				
            	    pushFollow(FOLLOW_19);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_20); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalMyDsl.g:807:3: ( (lv_request_11_0= ruleRequest ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:808:4: (lv_request_11_0= ruleRequest )
                    {
                    // InternalMyDsl.g:808:4: (lv_request_11_0= ruleRequest )
                    // InternalMyDsl.g:809:5: lv_request_11_0= ruleRequest
                    {

                    					newCompositeNode(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_request_11_0=ruleRequest();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServicioRestRule());
                    					}
                    					set(
                    						current,
                    						"request",
                    						lv_request_11_0,
                    						"org.xtext.example.mydsl.MyDsl.Request");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:826:3: ( (lv_response_12_0= ruleResponse ) )
            // InternalMyDsl.g:827:4: (lv_response_12_0= ruleResponse )
            {
            // InternalMyDsl.g:827:4: (lv_response_12_0= ruleResponse )
            // InternalMyDsl.g:828:5: lv_response_12_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_21);
            lv_response_12_0=ruleResponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"response",
            						lv_response_12_0,
            						"org.xtext.example.mydsl.MyDsl.Response");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServicioRest"


    // $ANTLR start "entryRuleParametro"
    // InternalMyDsl.g:853:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalMyDsl.g:853:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalMyDsl.g:854:2: iv_ruleParametro= ruleParametro EOF
            {
             newCompositeNode(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametro=ruleParametro();

            state._fsp--;

             current =iv_ruleParametro; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalMyDsl.g:860:1: ruleParametro returns [EObject current=null] : (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        EObject this_QueryParam_0 = null;

        EObject this_PathParam_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:866:2: ( (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam ) )
            // InternalMyDsl.g:867:2: (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam )
            {
            // InternalMyDsl.g:867:2: (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:868:3: this_QueryParam_0= ruleQueryParam
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getQueryParamParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryParam_0=ruleQueryParam();

                    state._fsp--;


                    			current = this_QueryParam_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:877:3: this_PathParam_1= rulePathParam
                    {

                    			newCompositeNode(grammarAccess.getParametroAccess().getPathParamParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PathParam_1=rulePathParam();

                    state._fsp--;


                    			current = this_PathParam_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleQueryParam"
    // InternalMyDsl.g:889:1: entryRuleQueryParam returns [EObject current=null] : iv_ruleQueryParam= ruleQueryParam EOF ;
    public final EObject entryRuleQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParam = null;


        try {
            // InternalMyDsl.g:889:51: (iv_ruleQueryParam= ruleQueryParam EOF )
            // InternalMyDsl.g:890:2: iv_ruleQueryParam= ruleQueryParam EOF
            {
             newCompositeNode(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryParam=ruleQueryParam();

            state._fsp--;

             current =iv_ruleQueryParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalMyDsl.g:896:1: ruleQueryParam returns [EObject current=null] : (otherlv_0= '?${' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' ) ;
    public final EObject ruleQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:902:2: ( (otherlv_0= '?${' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' ) )
            // InternalMyDsl.g:903:2: (otherlv_0= '?${' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' )
            {
            // InternalMyDsl.g:903:2: (otherlv_0= '?${' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' )
            // InternalMyDsl.g:904:3: otherlv_0= '?${' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryParamAccess().getQuestionMarkDollarSignLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:908:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:909:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:909:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:910:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQueryParamAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryParamRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRulePathParam"
    // InternalMyDsl.g:935:1: entryRulePathParam returns [EObject current=null] : iv_rulePathParam= rulePathParam EOF ;
    public final EObject entryRulePathParam() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathParam = null;


        try {
            // InternalMyDsl.g:935:50: (iv_rulePathParam= rulePathParam EOF )
            // InternalMyDsl.g:936:2: iv_rulePathParam= rulePathParam EOF
            {
             newCompositeNode(grammarAccess.getPathParamRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePathParam=rulePathParam();

            state._fsp--;

             current =iv_rulePathParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathParam"


    // $ANTLR start "rulePathParam"
    // InternalMyDsl.g:942:1: rulePathParam returns [EObject current=null] : (otherlv_0= '/:{' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' ) ;
    public final EObject rulePathParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:948:2: ( (otherlv_0= '/:{' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' ) )
            // InternalMyDsl.g:949:2: (otherlv_0= '/:{' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' )
            {
            // InternalMyDsl.g:949:2: (otherlv_0= '/:{' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}' )
            // InternalMyDsl.g:950:3: otherlv_0= '/:{' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:954:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:955:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:955:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:956:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPathParamAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathParamRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathParam"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:981:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalMyDsl.g:981:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalMyDsl.g:982:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
            {
             newCompositeNode(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleEntity=ruleSimpleEntity();

            state._fsp--;

             current =iv_ruleSimpleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalMyDsl.g:988:1: ruleSimpleEntity returns [EObject current=null] : (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) ;
    public final EObject ruleSimpleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nombre_1_0 = null;

        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:994:2: ( (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:995:2: (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:995:2: (otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            // InternalMyDsl.g:996:3: otherlv_0= 'SimpleEntity' ( (lv_nombre_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0());
            		
            // InternalMyDsl.g:1000:3: ( (lv_nombre_1_0= ruleEString ) )
            // InternalMyDsl.g:1001:4: (lv_nombre_1_0= ruleEString )
            {
            // InternalMyDsl.g:1001:4: (lv_nombre_1_0= ruleEString )
            // InternalMyDsl.g:1002:5: lv_nombre_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleEntityAccess().getNombreEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_nombre_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            					}
            					set(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1023:3: ( (lv_atributos_3_0= ruleAtributoSimple ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=31 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1024:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    {
            	    // InternalMyDsl.g:1024:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    // InternalMyDsl.g:1025:5: lv_atributos_3_0= ruleAtributoSimple
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_atributos_3_0=ruleAtributoSimple();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AtributoSimple");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:1050:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalMyDsl.g:1050:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalMyDsl.g:1051:2: iv_ruleResponse= ruleResponse EOF
            {
             newCompositeNode(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponse=ruleResponse();

            state._fsp--;

             current =iv_ruleResponse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalMyDsl.g:1057:1: ruleResponse returns [EObject current=null] : (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EQUAL_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1063:2: ( (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' ) )
            // InternalMyDsl.g:1064:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' )
            {
            // InternalMyDsl.g:1064:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' )
            // InternalMyDsl.g:1065:3: otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getResponseKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getTypeKeyword_2());
            		
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FOLLOW_23); 

            			newLeafNode(this_EQUAL_3, grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1081:3: ( (lv_type_4_0= ruleType ) )
            // InternalMyDsl.g:1082:4: (lv_type_4_0= ruleType )
            {
            // InternalMyDsl.g:1082:4: (lv_type_4_0= ruleType )
            // InternalMyDsl.g:1083:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getResponseAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponseRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_21); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleRequest"
    // InternalMyDsl.g:1112:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalMyDsl.g:1112:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalMyDsl.g:1113:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMyDsl.g:1119:1: ruleRequest returns [EObject current=null] : (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EQUAL_3=null;
        Token this_SEMICOLON_5=null;
        Token otherlv_6=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1125:2: ( (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' ) )
            // InternalMyDsl.g:1126:2: (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' )
            {
            // InternalMyDsl.g:1126:2: (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}' )
            // InternalMyDsl.g:1127:3: otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( (lv_type_4_0= ruleType ) ) this_SEMICOLON_5= RULE_SEMICOLON otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestAccess().getRequestKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestAccess().getTypeKeyword_2());
            		
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FOLLOW_23); 

            			newLeafNode(this_EQUAL_3, grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1143:3: ( (lv_type_4_0= ruleType ) )
            // InternalMyDsl.g:1144:4: (lv_type_4_0= ruleType )
            {
            // InternalMyDsl.g:1144:4: (lv_type_4_0= ruleType )
            // InternalMyDsl.g:1145:5: lv_type_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getRequestAccess().getTypeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_21); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:1174:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:1174:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:1175:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:1181:1: ruleType returns [EObject current=null] : ( (this_TipoEntidad_0= ruleTipoEntidad | this_PrimitiveType_1= rulePrimitiveType ) (otherlv_2= '[' otherlv_3= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_TipoEntidad_0 = null;

        EObject this_PrimitiveType_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1187:2: ( ( (this_TipoEntidad_0= ruleTipoEntidad | this_PrimitiveType_1= rulePrimitiveType ) (otherlv_2= '[' otherlv_3= ']' )? ) )
            // InternalMyDsl.g:1188:2: ( (this_TipoEntidad_0= ruleTipoEntidad | this_PrimitiveType_1= rulePrimitiveType ) (otherlv_2= '[' otherlv_3= ']' )? )
            {
            // InternalMyDsl.g:1188:2: ( (this_TipoEntidad_0= ruleTipoEntidad | this_PrimitiveType_1= rulePrimitiveType ) (otherlv_2= '[' otherlv_3= ']' )? )
            // InternalMyDsl.g:1189:3: (this_TipoEntidad_0= ruleTipoEntidad | this_PrimitiveType_1= rulePrimitiveType ) (otherlv_2= '[' otherlv_3= ']' )?
            {
            // InternalMyDsl.g:1189:3: (this_TipoEntidad_0= ruleTipoEntidad | this_PrimitiveType_1= rulePrimitiveType )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=31 && LA14_0<=33)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1190:4: this_TipoEntidad_0= ruleTipoEntidad
                    {

                    				newCompositeNode(grammarAccess.getTypeAccess().getTipoEntidadParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_24);
                    this_TipoEntidad_0=ruleTipoEntidad();

                    state._fsp--;


                    				current = this_TipoEntidad_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1199:4: this_PrimitiveType_1= rulePrimitiveType
                    {

                    				newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_24);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;


                    				current = this_PrimitiveType_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1208:3: (otherlv_2= '[' otherlv_3= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1209:4: otherlv_2= '[' otherlv_3= ']'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTipoEntidad"
    // InternalMyDsl.g:1222:1: entryRuleTipoEntidad returns [EObject current=null] : iv_ruleTipoEntidad= ruleTipoEntidad EOF ;
    public final EObject entryRuleTipoEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTipoEntidad = null;


        try {
            // InternalMyDsl.g:1222:52: (iv_ruleTipoEntidad= ruleTipoEntidad EOF )
            // InternalMyDsl.g:1223:2: iv_ruleTipoEntidad= ruleTipoEntidad EOF
            {
             newCompositeNode(grammarAccess.getTipoEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoEntidad=ruleTipoEntidad();

            state._fsp--;

             current =iv_ruleTipoEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoEntidad"


    // $ANTLR start "ruleTipoEntidad"
    // InternalMyDsl.g:1229:1: ruleTipoEntidad returns [EObject current=null] : ( (lv_nombre_0_0= ruleEString ) ) ;
    public final EObject ruleTipoEntidad() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nombre_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1235:2: ( ( (lv_nombre_0_0= ruleEString ) ) )
            // InternalMyDsl.g:1236:2: ( (lv_nombre_0_0= ruleEString ) )
            {
            // InternalMyDsl.g:1236:2: ( (lv_nombre_0_0= ruleEString ) )
            // InternalMyDsl.g:1237:3: (lv_nombre_0_0= ruleEString )
            {
            // InternalMyDsl.g:1237:3: (lv_nombre_0_0= ruleEString )
            // InternalMyDsl.g:1238:4: lv_nombre_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getTipoEntidadAccess().getNombreEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nombre_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTipoEntidadRule());
            				}
            				set(
            					current,
            					"nombre",
            					lv_nombre_0_0,
            					"org.xtext.example.mydsl.MyDsl.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoEntidad"


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:1258:1: entryRuleMyString returns [EObject current=null] : iv_ruleMyString= ruleMyString EOF ;
    public final EObject entryRuleMyString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyString = null;


        try {
            // InternalMyDsl.g:1258:49: (iv_ruleMyString= ruleMyString EOF )
            // InternalMyDsl.g:1259:2: iv_ruleMyString= ruleMyString EOF
            {
             newCompositeNode(grammarAccess.getMyStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyString=ruleMyString();

            state._fsp--;

             current =iv_ruleMyString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyString"


    // $ANTLR start "ruleMyString"
    // InternalMyDsl.g:1265:1: ruleMyString returns [EObject current=null] : ( (lv_nombre_0_0= 'string' ) ) ;
    public final EObject ruleMyString() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1271:2: ( ( (lv_nombre_0_0= 'string' ) ) )
            // InternalMyDsl.g:1272:2: ( (lv_nombre_0_0= 'string' ) )
            {
            // InternalMyDsl.g:1272:2: ( (lv_nombre_0_0= 'string' ) )
            // InternalMyDsl.g:1273:3: (lv_nombre_0_0= 'string' )
            {
            // InternalMyDsl.g:1273:3: (lv_nombre_0_0= 'string' )
            // InternalMyDsl.g:1274:4: lv_nombre_0_0= 'string'
            {
            lv_nombre_0_0=(Token)match(input,31,FOLLOW_2); 

            				newLeafNode(lv_nombre_0_0, grammarAccess.getMyStringAccess().getNombreStringKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMyStringRule());
            				}
            				setWithLastConsumed(current, "nombre", lv_nombre_0_0, "string");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyString"


    // $ANTLR start "entryRuleMyNumeric"
    // InternalMyDsl.g:1289:1: entryRuleMyNumeric returns [EObject current=null] : iv_ruleMyNumeric= ruleMyNumeric EOF ;
    public final EObject entryRuleMyNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyNumeric = null;


        try {
            // InternalMyDsl.g:1289:50: (iv_ruleMyNumeric= ruleMyNumeric EOF )
            // InternalMyDsl.g:1290:2: iv_ruleMyNumeric= ruleMyNumeric EOF
            {
             newCompositeNode(grammarAccess.getMyNumericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyNumeric=ruleMyNumeric();

            state._fsp--;

             current =iv_ruleMyNumeric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyNumeric"


    // $ANTLR start "ruleMyNumeric"
    // InternalMyDsl.g:1296:1: ruleMyNumeric returns [EObject current=null] : ( (lv_nombre_0_0= 'int' ) ) ;
    public final EObject ruleMyNumeric() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1302:2: ( ( (lv_nombre_0_0= 'int' ) ) )
            // InternalMyDsl.g:1303:2: ( (lv_nombre_0_0= 'int' ) )
            {
            // InternalMyDsl.g:1303:2: ( (lv_nombre_0_0= 'int' ) )
            // InternalMyDsl.g:1304:3: (lv_nombre_0_0= 'int' )
            {
            // InternalMyDsl.g:1304:3: (lv_nombre_0_0= 'int' )
            // InternalMyDsl.g:1305:4: lv_nombre_0_0= 'int'
            {
            lv_nombre_0_0=(Token)match(input,32,FOLLOW_2); 

            				newLeafNode(lv_nombre_0_0, grammarAccess.getMyNumericAccess().getNombreIntKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMyNumericRule());
            				}
            				setWithLastConsumed(current, "nombre", lv_nombre_0_0, "int");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyNumeric"


    // $ANTLR start "entryRuleMyBoolean"
    // InternalMyDsl.g:1320:1: entryRuleMyBoolean returns [EObject current=null] : iv_ruleMyBoolean= ruleMyBoolean EOF ;
    public final EObject entryRuleMyBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyBoolean = null;


        try {
            // InternalMyDsl.g:1320:50: (iv_ruleMyBoolean= ruleMyBoolean EOF )
            // InternalMyDsl.g:1321:2: iv_ruleMyBoolean= ruleMyBoolean EOF
            {
             newCompositeNode(grammarAccess.getMyBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyBoolean=ruleMyBoolean();

            state._fsp--;

             current =iv_ruleMyBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyBoolean"


    // $ANTLR start "ruleMyBoolean"
    // InternalMyDsl.g:1327:1: ruleMyBoolean returns [EObject current=null] : ( (lv_nombre_0_0= 'boolean' ) ) ;
    public final EObject ruleMyBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1333:2: ( ( (lv_nombre_0_0= 'boolean' ) ) )
            // InternalMyDsl.g:1334:2: ( (lv_nombre_0_0= 'boolean' ) )
            {
            // InternalMyDsl.g:1334:2: ( (lv_nombre_0_0= 'boolean' ) )
            // InternalMyDsl.g:1335:3: (lv_nombre_0_0= 'boolean' )
            {
            // InternalMyDsl.g:1335:3: (lv_nombre_0_0= 'boolean' )
            // InternalMyDsl.g:1336:4: lv_nombre_0_0= 'boolean'
            {
            lv_nombre_0_0=(Token)match(input,33,FOLLOW_2); 

            				newLeafNode(lv_nombre_0_0, grammarAccess.getMyBooleanAccess().getNombreBooleanKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getMyBooleanRule());
            				}
            				setWithLastConsumed(current, "nombre", lv_nombre_0_0, "boolean");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:1351:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMyDsl.g:1351:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMyDsl.g:1352:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMyDsl.g:1358:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1364:2: ( (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:1365:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:1365:2: (otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalMyDsl.g:1366:3: otherlv_0= 'Mapping' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getValueKeyword_2());
            		
            // InternalMyDsl.g:1378:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1379:4: ( ruleEString )
            {
            // InternalMyDsl.g:1379:4: ( ruleEString )
            // InternalMyDsl.g:1380:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMappingAccess().getValueElementoCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleAsercion"
    // InternalMyDsl.g:1402:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // InternalMyDsl.g:1402:49: (iv_ruleAsercion= ruleAsercion EOF )
            // InternalMyDsl.g:1403:2: iv_ruleAsercion= ruleAsercion EOF
            {
             newCompositeNode(grammarAccess.getAsercionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsercion=ruleAsercion();

            state._fsp--;

             current =iv_ruleAsercion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsercion"


    // $ANTLR start "ruleAsercion"
    // InternalMyDsl.g:1409:1: ruleAsercion returns [EObject current=null] : (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1415:2: ( (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1416:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1416:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1417:3: otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAsercionAccess().getAsercionKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAsercionAccess().getElemento1Keyword_2());
            		
            // InternalMyDsl.g:1429:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1430:4: ( ruleEString )
            {
            // InternalMyDsl.g:1430:4: ( ruleEString )
            // InternalMyDsl.g:1431:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAsercionAccess().getElemento2Keyword_4());
            		
            // InternalMyDsl.g:1449:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1450:4: ( ruleEString )
            {
            // InternalMyDsl.g:1450:4: ( ruleEString )
            // InternalMyDsl.g:1451:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAsercionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsercion"


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:1473:1: ruleTipoAtributo returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) ;
    public final Enumerator ruleTipoAtributo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1479:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) )
            // InternalMyDsl.g:1480:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            {
            // InternalMyDsl.g:1480:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 32:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1481:3: (enumLiteral_0= 'string' )
                    {
                    // InternalMyDsl.g:1481:3: (enumLiteral_0= 'string' )
                    // InternalMyDsl.g:1482:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1489:3: (enumLiteral_1= 'int' )
                    {
                    // InternalMyDsl.g:1489:3: (enumLiteral_1= 'int' )
                    // InternalMyDsl.g:1490:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1497:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalMyDsl.g:1497:3: (enumLiteral_2= 'boolean' )
                    // InternalMyDsl.g:1498:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoAtributo"


    // $ANTLR start "ruleMockaroo"
    // InternalMyDsl.g:1508:1: ruleMockaroo returns [Enumerator current=null] : ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) ;
    public final Enumerator ruleMockaroo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1514:2: ( ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) )
            // InternalMyDsl.g:1515:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            {
            // InternalMyDsl.g:1515:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            int alt17=14;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt17=1;
                }
                break;
            case 40:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            case 42:
                {
                alt17=4;
                }
                break;
            case 43:
                {
                alt17=5;
                }
                break;
            case 44:
                {
                alt17=6;
                }
                break;
            case 45:
                {
                alt17=7;
                }
                break;
            case 46:
                {
                alt17=8;
                }
                break;
            case 47:
                {
                alt17=9;
                }
                break;
            case 48:
                {
                alt17=10;
                }
                break;
            case 49:
                {
                alt17=11;
                }
                break;
            case 50:
                {
                alt17=12;
                }
                break;
            case 51:
                {
                alt17=13;
                }
                break;
            case 52:
                {
                alt17=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1516:3: (enumLiteral_0= 'FirstNameType' )
                    {
                    // InternalMyDsl.g:1516:3: (enumLiteral_0= 'FirstNameType' )
                    // InternalMyDsl.g:1517:4: enumLiteral_0= 'FirstNameType'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1524:3: (enumLiteral_1= 'LastNameType' )
                    {
                    // InternalMyDsl.g:1524:3: (enumLiteral_1= 'LastNameType' )
                    // InternalMyDsl.g:1525:4: enumLiteral_1= 'LastNameType'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1532:3: (enumLiteral_2= 'FamilyNameType' )
                    {
                    // InternalMyDsl.g:1532:3: (enumLiteral_2= 'FamilyNameType' )
                    // InternalMyDsl.g:1533:4: enumLiteral_2= 'FamilyNameType'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1540:3: (enumLiteral_3= 'FullNameType' )
                    {
                    // InternalMyDsl.g:1540:3: (enumLiteral_3= 'FullNameType' )
                    // InternalMyDsl.g:1541:4: enumLiteral_3= 'FullNameType'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1548:3: (enumLiteral_4= 'GenderType' )
                    {
                    // InternalMyDsl.g:1548:3: (enumLiteral_4= 'GenderType' )
                    // InternalMyDsl.g:1549:4: enumLiteral_4= 'GenderType'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1556:3: (enumLiteral_5= 'EmailAddressType' )
                    {
                    // InternalMyDsl.g:1556:3: (enumLiteral_5= 'EmailAddressType' )
                    // InternalMyDsl.g:1557:4: enumLiteral_5= 'EmailAddressType'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1564:3: (enumLiteral_6= 'PhoneType' )
                    {
                    // InternalMyDsl.g:1564:3: (enumLiteral_6= 'PhoneType' )
                    // InternalMyDsl.g:1565:4: enumLiteral_6= 'PhoneType'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1572:3: (enumLiteral_7= 'CountryType' )
                    {
                    // InternalMyDsl.g:1572:3: (enumLiteral_7= 'CountryType' )
                    // InternalMyDsl.g:1573:4: enumLiteral_7= 'CountryType'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1580:3: (enumLiteral_8= 'CityType' )
                    {
                    // InternalMyDsl.g:1580:3: (enumLiteral_8= 'CityType' )
                    // InternalMyDsl.g:1581:4: enumLiteral_8= 'CityType'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1588:3: (enumLiteral_9= 'CountryCodeType' )
                    {
                    // InternalMyDsl.g:1588:3: (enumLiteral_9= 'CountryCodeType' )
                    // InternalMyDsl.g:1589:4: enumLiteral_9= 'CountryCodeType'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1596:3: (enumLiteral_10= 'LatitudeType' )
                    {
                    // InternalMyDsl.g:1596:3: (enumLiteral_10= 'LatitudeType' )
                    // InternalMyDsl.g:1597:4: enumLiteral_10= 'LatitudeType'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1604:3: (enumLiteral_11= 'LongitudType' )
                    {
                    // InternalMyDsl.g:1604:3: (enumLiteral_11= 'LongitudType' )
                    // InternalMyDsl.g:1605:4: enumLiteral_11= 'LongitudType'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1612:3: (enumLiteral_12= 'RowNumberType' )
                    {
                    // InternalMyDsl.g:1612:3: (enumLiteral_12= 'RowNumberType' )
                    // InternalMyDsl.g:1613:4: enumLiteral_12= 'RowNumberType'
                    {
                    enumLiteral_12=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1620:3: (enumLiteral_13= 'BooleanType' )
                    {
                    // InternalMyDsl.g:1620:3: (enumLiteral_13= 'BooleanType' )
                    // InternalMyDsl.g:1621:4: enumLiteral_13= 'BooleanType'
                    {
                    enumLiteral_13=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMockaroo"


    // $ANTLR start "ruleTipoMetodoRest"
    // InternalMyDsl.g:1631:1: ruleTipoMetodoRest returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleTipoMetodoRest() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1637:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMyDsl.g:1638:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMyDsl.g:1638:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt18=1;
                }
                break;
            case 54:
                {
                alt18=2;
                }
                break;
            case 55:
                {
                alt18=3;
                }
                break;
            case 56:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1639:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMyDsl.g:1639:3: (enumLiteral_0= 'GET' )
                    // InternalMyDsl.g:1640:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1647:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMyDsl.g:1647:3: (enumLiteral_1= 'POST' )
                    // InternalMyDsl.g:1648:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1655:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalMyDsl.g:1655:3: (enumLiteral_2= 'PUT' )
                    // InternalMyDsl.g:1656:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1663:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMyDsl.g:1663:3: (enumLiteral_3= 'DELETE' )
                    // InternalMyDsl.g:1664:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoMetodoRest"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x01E0000388100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x01E0000380000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x001FFF8000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000380400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000003800000C0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});

}