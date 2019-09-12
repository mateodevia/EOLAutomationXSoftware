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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'apiURL'", "'SimpleEntity'", "'{'", "'}'", "'('", "'PK,mockType'", "'mockType'", "')'", "'['", "']'", "'Entity'", "'URL'", "'/'", "'?${'", "'/:{'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'description'", "'Mapping'", "'Assertions'", "'{parameter'", "'.'", "','", "'value'", "'request->'", "'Asercion'", "'elemento1'", "'elemento2'", "'true'", "'false'", "'string'", "'int'", "'boolean'", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_EQUAL=4;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=8;
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
    // InternalMyDsl.g:72:1: ruleApi returns [EObject current=null] : ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ( (lv_tests_8_0= ruleTest ) )* ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_EQUAL_2=null;
        Token this_SEMICOLON_4=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;

        EObject lv_entidades_5_0 = null;

        EObject lv_primitivetypes_6_0 = null;

        EObject lv_serviciosRest_7_0 = null;

        EObject lv_tests_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ( (lv_tests_8_0= ruleTest ) )* ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ( (lv_tests_8_0= ruleTest ) )* )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ( (lv_tests_8_0= ruleTest ) )* )
            // InternalMyDsl.g:80:3: () otherlv_1= 'apiURL' this_EQUAL_2= RULE_EQUAL ( (lv_url_3_0= ruleEString ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_entidades_5_0= ruleEntidad ) )* ( (lv_primitivetypes_6_0= rulePrimitiveType ) )* ( (lv_serviciosRest_7_0= ruleServicioRest ) )* ( (lv_tests_8_0= ruleTest ) )*
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

                if ( (LA1_0==14||LA1_0==23) ) {
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

                if ( ((LA2_0>=46 && LA2_0<=48)) ) {
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

                if ( ((LA3_0>=63 && LA3_0<=66)) ) {
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

            // InternalMyDsl.g:175:3: ( (lv_tests_8_0= ruleTest ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==31) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:176:4: (lv_tests_8_0= ruleTest )
            	    {
            	    // InternalMyDsl.g:176:4: (lv_tests_8_0= ruleTest )
            	    // InternalMyDsl.g:177:5: lv_tests_8_0= ruleTest
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getTestsTestParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_tests_8_0=ruleTest();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tests",
            	    						lv_tests_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalMyDsl.g:198:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalMyDsl.g:198:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalMyDsl.g:199:2: iv_ruleEntidad= ruleEntidad EOF
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
    // InternalMyDsl.g:205:1: ruleEntidad returns [EObject current=null] : (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleEntity_0 = null;

        EObject this_MockarooEntity_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:211:2: ( (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity ) )
            // InternalMyDsl.g:212:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            {
            // InternalMyDsl.g:212:2: (this_SimpleEntity_0= ruleSimpleEntity | this_MockarooEntity_1= ruleMockarooEntity )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:213:3: this_SimpleEntity_0= ruleSimpleEntity
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
                    // InternalMyDsl.g:222:3: this_MockarooEntity_1= ruleMockarooEntity
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


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:234:1: entryRuleSimpleEntity returns [EObject current=null] : iv_ruleSimpleEntity= ruleSimpleEntity EOF ;
    public final EObject entryRuleSimpleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleEntity = null;


        try {
            // InternalMyDsl.g:234:53: (iv_ruleSimpleEntity= ruleSimpleEntity EOF )
            // InternalMyDsl.g:235:2: iv_ruleSimpleEntity= ruleSimpleEntity EOF
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
    // InternalMyDsl.g:241:1: ruleSimpleEntity returns [EObject current=null] : (otherlv_0= 'SimpleEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) ;
    public final EObject ruleSimpleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:247:2: ( (otherlv_0= 'SimpleEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:248:2: (otherlv_0= 'SimpleEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:248:2: (otherlv_0= 'SimpleEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}' )
            // InternalMyDsl.g:249:3: otherlv_0= 'SimpleEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributoSimple ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0());
            		
            // InternalMyDsl.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:275:3: ( (lv_atributos_3_0= ruleAtributoSimple ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=46 && LA6_0<=48)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:276:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    {
            	    // InternalMyDsl.g:276:4: (lv_atributos_3_0= ruleAtributoSimple )
            	    // InternalMyDsl.g:277:5: lv_atributos_3_0= ruleAtributoSimple
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:302:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:302:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:303:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalMyDsl.g:309:1: ruleAtributo returns [EObject current=null] : (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        EObject this_AtributoMocka_0 = null;

        EObject this_AtributoArreglo_1 = null;

        EObject this_AtributoSimple_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:315:2: ( (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple ) )
            // InternalMyDsl.g:316:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            {
            // InternalMyDsl.g:316:2: (this_AtributoMocka_0= ruleAtributoMocka | this_AtributoArreglo_1= ruleAtributoArreglo | this_AtributoSimple_2= ruleAtributoSimple )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    int LA7_5 = input.LA(3);

                    if ( (LA7_5==RULE_SEMICOLON) ) {
                        alt7=3;
                    }
                    else if ( (LA7_5==17) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 47:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==21) ) {
                    alt7=2;
                }
                else if ( (LA7_2==RULE_ID) ) {
                    int LA7_5 = input.LA(3);

                    if ( (LA7_5==RULE_SEMICOLON) ) {
                        alt7=3;
                    }
                    else if ( (LA7_5==17) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==RULE_ID) ) {
                    int LA7_5 = input.LA(3);

                    if ( (LA7_5==RULE_SEMICOLON) ) {
                        alt7=3;
                    }
                    else if ( (LA7_5==17) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 5, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_3==21) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:317:3: this_AtributoMocka_0= ruleAtributoMocka
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
                    // InternalMyDsl.g:326:3: this_AtributoArreglo_1= ruleAtributoArreglo
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
                    // InternalMyDsl.g:335:3: this_AtributoSimple_2= ruleAtributoSimple
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
    // InternalMyDsl.g:347:1: entryRuleAtributoMocka returns [EObject current=null] : iv_ruleAtributoMocka= ruleAtributoMocka EOF ;
    public final EObject entryRuleAtributoMocka() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoMocka = null;


        try {
            // InternalMyDsl.g:347:54: (iv_ruleAtributoMocka= ruleAtributoMocka EOF )
            // InternalMyDsl.g:348:2: iv_ruleAtributoMocka= ruleAtributoMocka EOF
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
    // InternalMyDsl.g:354:1: ruleAtributoMocka returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoMocka() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_primaryKey_3_0=null;
        Token this_EQUAL_4=null;
        Token otherlv_6=null;
        Token this_EQUAL_7=null;
        Token otherlv_9=null;
        Token this_SEMICOLON_10=null;
        Enumerator lv_tipo_0_0 = null;

        Enumerator lv_mockType_5_0 = null;

        Enumerator lv_mockType_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:360:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON ) )
            // InternalMyDsl.g:361:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:361:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON )
            // InternalMyDsl.g:362:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' ) this_SEMICOLON_10= RULE_SEMICOLON
            {
            // InternalMyDsl.g:362:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:363:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:363:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:364:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMyDsl.g:381:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:382:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:382:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:383:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtributoMockaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoMockaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:399:3: (otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')' )
            // InternalMyDsl.g:400:4: otherlv_2= '(' ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) ) otherlv_9= ')'
            {
            otherlv_2=(Token)match(input,17,FOLLOW_14); 

            				newLeafNode(otherlv_2, grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMyDsl.g:404:4: ( ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) ) | (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:405:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:405:5: ( ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:406:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) ) this_EQUAL_4= RULE_EQUAL ( (lv_mockType_5_0= ruleMockaroo ) )
                    {
                    // InternalMyDsl.g:406:6: ( (lv_primaryKey_3_0= 'PK,mockType' ) )
                    // InternalMyDsl.g:407:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    {
                    // InternalMyDsl.g:407:7: (lv_primaryKey_3_0= 'PK,mockType' )
                    // InternalMyDsl.g:408:8: lv_primaryKey_3_0= 'PK,mockType'
                    {
                    lv_primaryKey_3_0=(Token)match(input,18,FOLLOW_3); 

                    								newLeafNode(lv_primaryKey_3_0, grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getAtributoMockaRule());
                    								}
                    								setWithLastConsumed(current, "primaryKey", true, "PK,mockType");
                    							

                    }


                    }

                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_15); 

                    						newLeafNode(this_EQUAL_4, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1());
                    					
                    // InternalMyDsl.g:424:6: ( (lv_mockType_5_0= ruleMockaroo ) )
                    // InternalMyDsl.g:425:7: (lv_mockType_5_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:425:7: (lv_mockType_5_0= ruleMockaroo )
                    // InternalMyDsl.g:426:8: lv_mockType_5_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0());
                    							
                    pushFollow(FOLLOW_16);
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
                    // InternalMyDsl.g:445:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    {
                    // InternalMyDsl.g:445:5: (otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) ) )
                    // InternalMyDsl.g:446:6: otherlv_6= 'mockType' this_EQUAL_7= RULE_EQUAL ( (lv_mockType_8_0= ruleMockaroo ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_3); 

                    						newLeafNode(otherlv_6, grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0());
                    					
                    this_EQUAL_7=(Token)match(input,RULE_EQUAL,FOLLOW_15); 

                    						newLeafNode(this_EQUAL_7, grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1());
                    					
                    // InternalMyDsl.g:454:6: ( (lv_mockType_8_0= ruleMockaroo ) )
                    // InternalMyDsl.g:455:7: (lv_mockType_8_0= ruleMockaroo )
                    {
                    // InternalMyDsl.g:455:7: (lv_mockType_8_0= ruleMockaroo )
                    // InternalMyDsl.g:456:8: lv_mockType_8_0= ruleMockaroo
                    {

                    								newCompositeNode(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0());
                    							
                    pushFollow(FOLLOW_16);
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

            otherlv_9=(Token)match(input,20,FOLLOW_5); 

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
    // InternalMyDsl.g:488:1: entryRuleAtributoArreglo returns [EObject current=null] : iv_ruleAtributoArreglo= ruleAtributoArreglo EOF ;
    public final EObject entryRuleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoArreglo = null;


        try {
            // InternalMyDsl.g:488:56: (iv_ruleAtributoArreglo= ruleAtributoArreglo EOF )
            // InternalMyDsl.g:489:2: iv_ruleAtributoArreglo= ruleAtributoArreglo EOF
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
    // InternalMyDsl.g:495:1: ruleAtributoArreglo returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoArreglo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token this_SEMICOLON_4=null;
        Enumerator lv_tipo_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:501:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalMyDsl.g:502:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:502:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalMyDsl.g:503:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) otherlv_1= '[' otherlv_2= ']' ( (lv_name_3_0= RULE_ID ) ) this_SEMICOLON_4= RULE_SEMICOLON
            {
            // InternalMyDsl.g:503:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:504:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:504:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:505:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_1=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:530:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMyDsl.g:531:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMyDsl.g:531:4: (lv_name_3_0= RULE_ID )
            // InternalMyDsl.g:532:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoArregloRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // InternalMyDsl.g:556:1: entryRuleAtributoSimple returns [EObject current=null] : iv_ruleAtributoSimple= ruleAtributoSimple EOF ;
    public final EObject entryRuleAtributoSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoSimple = null;


        try {
            // InternalMyDsl.g:556:55: (iv_ruleAtributoSimple= ruleAtributoSimple EOF )
            // InternalMyDsl.g:557:2: iv_ruleAtributoSimple= ruleAtributoSimple EOF
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
    // InternalMyDsl.g:563:1: ruleAtributoSimple returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ) ;
    public final EObject ruleAtributoSimple() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_SEMICOLON_2=null;
        Enumerator lv_tipo_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:569:2: ( ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON ) )
            // InternalMyDsl.g:570:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            {
            // InternalMyDsl.g:570:2: ( ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            // InternalMyDsl.g:571:3: ( (lv_tipo_0_0= ruleTipoAtributo ) ) ( (lv_name_1_0= RULE_ID ) ) this_SEMICOLON_2= RULE_SEMICOLON
            {
            // InternalMyDsl.g:571:3: ( (lv_tipo_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:572:4: (lv_tipo_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:572:4: (lv_tipo_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:573:5: lv_tipo_0_0= ruleTipoAtributo
            {

            					newCompositeNode(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMyDsl.g:590:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:591:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:591:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:592:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtributoSimpleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:616:1: entryRuleMyString returns [EObject current=null] : iv_ruleMyString= ruleMyString EOF ;
    public final EObject entryRuleMyString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyString = null;


        try {
            // InternalMyDsl.g:616:49: (iv_ruleMyString= ruleMyString EOF )
            // InternalMyDsl.g:617:2: iv_ruleMyString= ruleMyString EOF
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
    // InternalMyDsl.g:623:1: ruleMyString returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleMyString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:629:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalMyDsl.g:630:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalMyDsl.g:630:2: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:631:3: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:631:3: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:632:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMyStringRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleMyString"


    // $ANTLR start "entryRuleMyNumeric"
    // InternalMyDsl.g:652:1: entryRuleMyNumeric returns [EObject current=null] : iv_ruleMyNumeric= ruleMyNumeric EOF ;
    public final EObject entryRuleMyNumeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyNumeric = null;


        try {
            // InternalMyDsl.g:652:50: (iv_ruleMyNumeric= ruleMyNumeric EOF )
            // InternalMyDsl.g:653:2: iv_ruleMyNumeric= ruleMyNumeric EOF
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
    // InternalMyDsl.g:659:1: ruleMyNumeric returns [EObject current=null] : ( (lv_name_0_0= ruleEInt ) ) ;
    public final EObject ruleMyNumeric() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:665:2: ( ( (lv_name_0_0= ruleEInt ) ) )
            // InternalMyDsl.g:666:2: ( (lv_name_0_0= ruleEInt ) )
            {
            // InternalMyDsl.g:666:2: ( (lv_name_0_0= ruleEInt ) )
            // InternalMyDsl.g:667:3: (lv_name_0_0= ruleEInt )
            {
            // InternalMyDsl.g:667:3: (lv_name_0_0= ruleEInt )
            // InternalMyDsl.g:668:4: lv_name_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMyNumericRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyDsl.EInt");
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
    // $ANTLR end "ruleMyNumeric"


    // $ANTLR start "entryRuleMyBoolean"
    // InternalMyDsl.g:688:1: entryRuleMyBoolean returns [EObject current=null] : iv_ruleMyBoolean= ruleMyBoolean EOF ;
    public final EObject entryRuleMyBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyBoolean = null;


        try {
            // InternalMyDsl.g:688:50: (iv_ruleMyBoolean= ruleMyBoolean EOF )
            // InternalMyDsl.g:689:2: iv_ruleMyBoolean= ruleMyBoolean EOF
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
    // InternalMyDsl.g:695:1: ruleMyBoolean returns [EObject current=null] : ( (lv_name_0_0= ruleEBoolean ) ) ;
    public final EObject ruleMyBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:701:2: ( ( (lv_name_0_0= ruleEBoolean ) ) )
            // InternalMyDsl.g:702:2: ( (lv_name_0_0= ruleEBoolean ) )
            {
            // InternalMyDsl.g:702:2: ( (lv_name_0_0= ruleEBoolean ) )
            // InternalMyDsl.g:703:3: (lv_name_0_0= ruleEBoolean )
            {
            // InternalMyDsl.g:703:3: (lv_name_0_0= ruleEBoolean )
            // InternalMyDsl.g:704:4: lv_name_0_0= ruleEBoolean
            {

            				newCompositeNode(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMyBooleanRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyDsl.EBoolean");
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
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "entryRuleMockarooEntity"
    // InternalMyDsl.g:724:1: entryRuleMockarooEntity returns [EObject current=null] : iv_ruleMockarooEntity= ruleMockarooEntity EOF ;
    public final EObject entryRuleMockarooEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMockarooEntity = null;


        try {
            // InternalMyDsl.g:724:55: (iv_ruleMockarooEntity= ruleMockarooEntity EOF )
            // InternalMyDsl.g:725:2: iv_ruleMockarooEntity= ruleMockarooEntity EOF
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
    // InternalMyDsl.g:731:1: ruleMockarooEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) ;
    public final EObject ruleMockarooEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atributos_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:737:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:738:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:738:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}' )
            // InternalMyDsl.g:739:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_atributos_3_0= ruleAtributo ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMockarooEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:743:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:744:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:744:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:745:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMockarooEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMockarooEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:765:3: ( (lv_atributos_3_0= ruleAtributo ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=46 && LA9_0<=48)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:766:4: (lv_atributos_3_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:766:4: (lv_atributos_3_0= ruleAtributo )
            	    // InternalMyDsl.g:767:5: lv_atributos_3_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

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
    // InternalMyDsl.g:792:1: entryRuleServicioRest returns [EObject current=null] : iv_ruleServicioRest= ruleServicioRest EOF ;
    public final EObject entryRuleServicioRest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicioRest = null;


        try {
            // InternalMyDsl.g:792:53: (iv_ruleServicioRest= ruleServicioRest EOF )
            // InternalMyDsl.g:793:2: iv_ruleServicioRest= ruleServicioRest EOF
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
    // InternalMyDsl.g:799:1: ruleServicioRest returns [EObject current=null] : ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' ) ;
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

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_6_0 = null;

        EObject lv_parametros_7_0 = null;

        EObject lv_request_11_0 = null;

        EObject lv_response_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:805:2: ( ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:806:2: ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:806:2: ( ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}' )
            // InternalMyDsl.g:807:3: ( (lv_metodo_0_0= ruleTipoMetodoRest ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'URL' this_EQUAL_4= RULE_EQUAL otherlv_5= '/' ( (lv_url_6_0= ruleEString ) ) ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )* this_SEMICOLON_10= RULE_SEMICOLON ( (lv_request_11_0= ruleRequest ) )? ( (lv_response_12_0= ruleResponse ) ) otherlv_13= '}'
            {
            // InternalMyDsl.g:807:3: ( (lv_metodo_0_0= ruleTipoMetodoRest ) )
            // InternalMyDsl.g:808:4: (lv_metodo_0_0= ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:808:4: (lv_metodo_0_0= ruleTipoMetodoRest )
            // InternalMyDsl.g:809:5: lv_metodo_0_0= ruleTipoMetodoRest
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

            // InternalMyDsl.g:826:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:827:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:827:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:828:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicioRestRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getServicioRestAccess().getURLKeyword_3());
            		
            this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_20); 

            			newLeafNode(this_EQUAL_4, grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getServicioRestAccess().getSolidusKeyword_5());
            		
            // InternalMyDsl.g:861:3: ( (lv_url_6_0= ruleEString ) )
            // InternalMyDsl.g:862:4: (lv_url_6_0= ruleEString )
            {
            // InternalMyDsl.g:862:4: (lv_url_6_0= ruleEString )
            // InternalMyDsl.g:863:5: lv_url_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getUrlEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalMyDsl.g:880:3: ( ( (lv_parametros_7_0= ruleParametro ) ) | (otherlv_8= '/' ruleEString ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }
                else if ( (LA10_0==25) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:881:4: ( (lv_parametros_7_0= ruleParametro ) )
            	    {
            	    // InternalMyDsl.g:881:4: ( (lv_parametros_7_0= ruleParametro ) )
            	    // InternalMyDsl.g:882:5: (lv_parametros_7_0= ruleParametro )
            	    {
            	    // InternalMyDsl.g:882:5: (lv_parametros_7_0= ruleParametro )
            	    // InternalMyDsl.g:883:6: lv_parametros_7_0= ruleParametro
            	    {

            	    						newCompositeNode(grammarAccess.getServicioRestAccess().getParametrosParametroParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    // InternalMyDsl.g:901:4: (otherlv_8= '/' ruleEString )
            	    {
            	    // InternalMyDsl.g:901:4: (otherlv_8= '/' ruleEString )
            	    // InternalMyDsl.g:902:5: otherlv_8= '/' ruleEString
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_4); 

            	    					newLeafNode(otherlv_8, grammarAccess.getServicioRestAccess().getSolidusKeyword_7_1_0());
            	    				

            	    					newCompositeNode(grammarAccess.getServicioRestAccess().getEStringParserRuleCall_7_1_1());
            	    				
            	    pushFollow(FOLLOW_21);
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

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_22); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalMyDsl.g:919:3: ( (lv_request_11_0= ruleRequest ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:920:4: (lv_request_11_0= ruleRequest )
                    {
                    // InternalMyDsl.g:920:4: (lv_request_11_0= ruleRequest )
                    // InternalMyDsl.g:921:5: lv_request_11_0= ruleRequest
                    {

                    					newCompositeNode(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_22);
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

            // InternalMyDsl.g:938:3: ( (lv_response_12_0= ruleResponse ) )
            // InternalMyDsl.g:939:4: (lv_response_12_0= ruleResponse )
            {
            // InternalMyDsl.g:939:4: (lv_response_12_0= ruleResponse )
            // InternalMyDsl.g:940:5: lv_response_12_0= ruleResponse
            {

            					newCompositeNode(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

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
    // InternalMyDsl.g:965:1: entryRuleParametro returns [EObject current=null] : iv_ruleParametro= ruleParametro EOF ;
    public final EObject entryRuleParametro() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametro = null;


        try {
            // InternalMyDsl.g:965:50: (iv_ruleParametro= ruleParametro EOF )
            // InternalMyDsl.g:966:2: iv_ruleParametro= ruleParametro EOF
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
    // InternalMyDsl.g:972:1: ruleParametro returns [EObject current=null] : (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam ) ;
    public final EObject ruleParametro() throws RecognitionException {
        EObject current = null;

        EObject this_QueryParam_0 = null;

        EObject this_PathParam_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:978:2: ( (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam ) )
            // InternalMyDsl.g:979:2: (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam )
            {
            // InternalMyDsl.g:979:2: (this_QueryParam_0= ruleQueryParam | this_PathParam_1= rulePathParam )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:980:3: this_QueryParam_0= ruleQueryParam
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
                    // InternalMyDsl.g:989:3: this_PathParam_1= rulePathParam
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
    // InternalMyDsl.g:1001:1: entryRuleQueryParam returns [EObject current=null] : iv_ruleQueryParam= ruleQueryParam EOF ;
    public final EObject entryRuleQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParam = null;


        try {
            // InternalMyDsl.g:1001:51: (iv_ruleQueryParam= ruleQueryParam EOF )
            // InternalMyDsl.g:1002:2: iv_ruleQueryParam= ruleQueryParam EOF
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
    // InternalMyDsl.g:1008:1: ruleQueryParam returns [EObject current=null] : (otherlv_0= '?${' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleQueryParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1014:2: ( (otherlv_0= '?${' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalMyDsl.g:1015:2: (otherlv_0= '?${' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalMyDsl.g:1015:2: (otherlv_0= '?${' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' )
            // InternalMyDsl.g:1016:3: otherlv_0= '?${' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryParamAccess().getQuestionMarkDollarSignLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:1020:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1021:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1021:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1022:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

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
    // InternalMyDsl.g:1046:1: entryRulePathParam returns [EObject current=null] : iv_rulePathParam= rulePathParam EOF ;
    public final EObject entryRulePathParam() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathParam = null;


        try {
            // InternalMyDsl.g:1046:50: (iv_rulePathParam= rulePathParam EOF )
            // InternalMyDsl.g:1047:2: iv_rulePathParam= rulePathParam EOF
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
    // InternalMyDsl.g:1053:1: rulePathParam returns [EObject current=null] : (otherlv_0= '/:{' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject rulePathParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1059:2: ( (otherlv_0= '/:{' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // InternalMyDsl.g:1060:2: (otherlv_0= '/:{' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // InternalMyDsl.g:1060:2: (otherlv_0= '/:{' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}' )
            // InternalMyDsl.g:1061:3: otherlv_0= '/:{' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:1065:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1066:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1066:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1067:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:1091:1: entryRuleResponse returns [EObject current=null] : iv_ruleResponse= ruleResponse EOF ;
    public final EObject entryRuleResponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponse = null;


        try {
            // InternalMyDsl.g:1091:49: (iv_ruleResponse= ruleResponse EOF )
            // InternalMyDsl.g:1092:2: iv_ruleResponse= ruleResponse EOF
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
    // InternalMyDsl.g:1098:1: ruleResponse returns [EObject current=null] : (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' ) ;
    public final EObject ruleResponse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EQUAL_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Enumerator lv_tipoPrimitivo_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1104:2: ( (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' ) )
            // InternalMyDsl.g:1105:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' )
            {
            // InternalMyDsl.g:1105:2: (otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' )
            // InternalMyDsl.g:1106:3: otherlv_0= 'Response' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getResponseAccess().getResponseKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getResponseAccess().getTypeKeyword_2());
            		
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FOLLOW_25); 

            			newLeafNode(this_EQUAL_3, grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1122:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=46 && LA13_0<=48)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1123:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1123:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1124:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1124:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1125:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResponseRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_4, grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1137:4: ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) )
                    {
                    // InternalMyDsl.g:1137:4: ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) )
                    // InternalMyDsl.g:1138:5: (lv_tipoPrimitivo_5_0= ruleTipoAtributo )
                    {
                    // InternalMyDsl.g:1138:5: (lv_tipoPrimitivo_5_0= ruleTipoAtributo )
                    // InternalMyDsl.g:1139:6: lv_tipoPrimitivo_5_0= ruleTipoAtributo
                    {

                    						newCompositeNode(grammarAccess.getResponseAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_tipoPrimitivo_5_0=ruleTipoAtributo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResponseRule());
                    						}
                    						set(
                    							current,
                    							"tipoPrimitivo",
                    							lv_tipoPrimitivo_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TipoAtributo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1157:3: (otherlv_6= '[' otherlv_7= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1158:4: otherlv_6= '[' otherlv_7= ']'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1());
                    			

                    }
                    break;

            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_23); 

            			newLeafNode(this_SEMICOLON_8, grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_6());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMyDsl.g:1179:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalMyDsl.g:1179:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalMyDsl.g:1180:2: iv_ruleRequest= ruleRequest EOF
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
    // InternalMyDsl.g:1186:1: ruleRequest returns [EObject current=null] : (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_EQUAL_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_SEMICOLON_8=null;
        Token otherlv_9=null;
        Enumerator lv_tipoPrimitivo_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1192:2: ( (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' ) )
            // InternalMyDsl.g:1193:2: (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' )
            {
            // InternalMyDsl.g:1193:2: (otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}' )
            // InternalMyDsl.g:1194:3: otherlv_0= 'Request' otherlv_1= '{' otherlv_2= 'Type' this_EQUAL_3= RULE_EQUAL ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) ) (otherlv_6= '[' otherlv_7= ']' )? this_SEMICOLON_8= RULE_SEMICOLON otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRequestAccess().getRequestKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRequestAccess().getTypeKeyword_2());
            		
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FOLLOW_25); 

            			newLeafNode(this_EQUAL_3, grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1210:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=46 && LA15_0<=48)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1211:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1211:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:1212:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:1212:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:1213:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequestRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_4, grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1225:4: ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) )
                    {
                    // InternalMyDsl.g:1225:4: ( (lv_tipoPrimitivo_5_0= ruleTipoAtributo ) )
                    // InternalMyDsl.g:1226:5: (lv_tipoPrimitivo_5_0= ruleTipoAtributo )
                    {
                    // InternalMyDsl.g:1226:5: (lv_tipoPrimitivo_5_0= ruleTipoAtributo )
                    // InternalMyDsl.g:1227:6: lv_tipoPrimitivo_5_0= ruleTipoAtributo
                    {

                    						newCompositeNode(grammarAccess.getRequestAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_tipoPrimitivo_5_0=ruleTipoAtributo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequestRule());
                    						}
                    						set(
                    							current,
                    							"tipoPrimitivo",
                    							lv_tipoPrimitivo_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TipoAtributo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1245:3: (otherlv_6= '[' otherlv_7= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1246:4: otherlv_6= '[' otherlv_7= ']'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1());
                    			

                    }
                    break;

            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_23); 

            			newLeafNode(this_SEMICOLON_8, grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_6());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:1267:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalMyDsl.g:1267:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalMyDsl.g:1268:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalMyDsl.g:1274:1: rulePrimitiveType returns [EObject current=null] : ( (lv_name_0_0= ruleTipoAtributo ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1280:2: ( ( (lv_name_0_0= ruleTipoAtributo ) ) )
            // InternalMyDsl.g:1281:2: ( (lv_name_0_0= ruleTipoAtributo ) )
            {
            // InternalMyDsl.g:1281:2: ( (lv_name_0_0= ruleTipoAtributo ) )
            // InternalMyDsl.g:1282:3: (lv_name_0_0= ruleTipoAtributo )
            {
            // InternalMyDsl.g:1282:3: (lv_name_0_0= ruleTipoAtributo )
            // InternalMyDsl.g:1283:4: lv_name_0_0= ruleTipoAtributo
            {

            				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleTipoAtributo();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyDsl.TipoAtributo");
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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleDatoPrimitivo"
    // InternalMyDsl.g:1303:1: entryRuleDatoPrimitivo returns [EObject current=null] : iv_ruleDatoPrimitivo= ruleDatoPrimitivo EOF ;
    public final EObject entryRuleDatoPrimitivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatoPrimitivo = null;


        try {
            // InternalMyDsl.g:1303:54: (iv_ruleDatoPrimitivo= ruleDatoPrimitivo EOF )
            // InternalMyDsl.g:1304:2: iv_ruleDatoPrimitivo= ruleDatoPrimitivo EOF
            {
             newCompositeNode(grammarAccess.getDatoPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatoPrimitivo=ruleDatoPrimitivo();

            state._fsp--;

             current =iv_ruleDatoPrimitivo; 
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
    // $ANTLR end "entryRuleDatoPrimitivo"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalMyDsl.g:1310:1: ruleDatoPrimitivo returns [EObject current=null] : (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean ) ;
    public final EObject ruleDatoPrimitivo() throws RecognitionException {
        EObject current = null;

        EObject this_MyNumeric_0 = null;

        EObject this_MyString_1 = null;

        EObject this_MyBoolean_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1316:2: ( (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean ) )
            // InternalMyDsl.g:1317:2: (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean )
            {
            // InternalMyDsl.g:1317:2: (this_MyNumeric_0= ruleMyNumeric | this_MyString_1= ruleMyString | this_MyBoolean_2= ruleMyBoolean )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case 44:
            case 45:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1318:3: this_MyNumeric_0= ruleMyNumeric
                    {

                    			newCompositeNode(grammarAccess.getDatoPrimitivoAccess().getMyNumericParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyNumeric_0=ruleMyNumeric();

                    state._fsp--;


                    			current = this_MyNumeric_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1327:3: this_MyString_1= ruleMyString
                    {

                    			newCompositeNode(grammarAccess.getDatoPrimitivoAccess().getMyStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MyString_1=ruleMyString();

                    state._fsp--;


                    			current = this_MyString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1336:3: this_MyBoolean_2= ruleMyBoolean
                    {

                    			newCompositeNode(grammarAccess.getDatoPrimitivoAccess().getMyBooleanParserRuleCall_2());
                    		
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
    // $ANTLR end "ruleDatoPrimitivo"


    // $ANTLR start "entryRuleTest"
    // InternalMyDsl.g:1348:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalMyDsl.g:1348:45: (iv_ruleTest= ruleTest EOF )
            // InternalMyDsl.g:1349:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyDsl.g:1355:1: ruleTest returns [EObject current=null] : ( () otherlv_1= 'Test' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'service' this_EQUAL_5= RULE_EQUAL ( (otherlv_6= RULE_ID ) ) this_SEMICOLON_7= RULE_SEMICOLON otherlv_8= 'description' this_EQUAL_9= RULE_EQUAL ( (lv_descripcion_10_0= ruleEString ) ) this_SEMICOLON_11= RULE_SEMICOLON (otherlv_12= 'Mapping' otherlv_13= '[' ( (lv_mappings_14_0= ruleMapping ) )* otherlv_15= ']' )? otherlv_16= 'Assertions' otherlv_17= '{' ( (lv_asertions_18_0= ruleAsercion ) )* otherlv_19= '}' otherlv_20= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_EQUAL_5=null;
        Token otherlv_6=null;
        Token this_SEMICOLON_7=null;
        Token otherlv_8=null;
        Token this_EQUAL_9=null;
        Token this_SEMICOLON_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_descripcion_10_0 = null;

        EObject lv_mappings_14_0 = null;

        EObject lv_asertions_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1361:2: ( ( () otherlv_1= 'Test' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'service' this_EQUAL_5= RULE_EQUAL ( (otherlv_6= RULE_ID ) ) this_SEMICOLON_7= RULE_SEMICOLON otherlv_8= 'description' this_EQUAL_9= RULE_EQUAL ( (lv_descripcion_10_0= ruleEString ) ) this_SEMICOLON_11= RULE_SEMICOLON (otherlv_12= 'Mapping' otherlv_13= '[' ( (lv_mappings_14_0= ruleMapping ) )* otherlv_15= ']' )? otherlv_16= 'Assertions' otherlv_17= '{' ( (lv_asertions_18_0= ruleAsercion ) )* otherlv_19= '}' otherlv_20= '}' ) )
            // InternalMyDsl.g:1362:2: ( () otherlv_1= 'Test' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'service' this_EQUAL_5= RULE_EQUAL ( (otherlv_6= RULE_ID ) ) this_SEMICOLON_7= RULE_SEMICOLON otherlv_8= 'description' this_EQUAL_9= RULE_EQUAL ( (lv_descripcion_10_0= ruleEString ) ) this_SEMICOLON_11= RULE_SEMICOLON (otherlv_12= 'Mapping' otherlv_13= '[' ( (lv_mappings_14_0= ruleMapping ) )* otherlv_15= ']' )? otherlv_16= 'Assertions' otherlv_17= '{' ( (lv_asertions_18_0= ruleAsercion ) )* otherlv_19= '}' otherlv_20= '}' )
            {
            // InternalMyDsl.g:1362:2: ( () otherlv_1= 'Test' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'service' this_EQUAL_5= RULE_EQUAL ( (otherlv_6= RULE_ID ) ) this_SEMICOLON_7= RULE_SEMICOLON otherlv_8= 'description' this_EQUAL_9= RULE_EQUAL ( (lv_descripcion_10_0= ruleEString ) ) this_SEMICOLON_11= RULE_SEMICOLON (otherlv_12= 'Mapping' otherlv_13= '[' ( (lv_mappings_14_0= ruleMapping ) )* otherlv_15= ']' )? otherlv_16= 'Assertions' otherlv_17= '{' ( (lv_asertions_18_0= ruleAsercion ) )* otherlv_19= '}' otherlv_20= '}' )
            // InternalMyDsl.g:1363:3: () otherlv_1= 'Test' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'service' this_EQUAL_5= RULE_EQUAL ( (otherlv_6= RULE_ID ) ) this_SEMICOLON_7= RULE_SEMICOLON otherlv_8= 'description' this_EQUAL_9= RULE_EQUAL ( (lv_descripcion_10_0= ruleEString ) ) this_SEMICOLON_11= RULE_SEMICOLON (otherlv_12= 'Mapping' otherlv_13= '[' ( (lv_mappings_14_0= ruleMapping ) )* otherlv_15= ']' )? otherlv_16= 'Assertions' otherlv_17= '{' ( (lv_asertions_18_0= ruleAsercion ) )* otherlv_19= '}' otherlv_20= '}'
            {
            // InternalMyDsl.g:1363:3: ()
            // InternalMyDsl.g:1364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTestAccess().getTestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTestAccess().getTestKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            			newLeafNode(this_ID_2, grammarAccess.getTestAccess().getIDTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getServiceKeyword_4());
            		
            this_EQUAL_5=(Token)match(input,RULE_EQUAL,FOLLOW_10); 

            			newLeafNode(this_EQUAL_5, grammarAccess.getTestAccess().getEQUALTerminalRuleCall_5());
            		
            // InternalMyDsl.g:1390:3: ( (otherlv_6= RULE_ID ) )
            // InternalMyDsl.g:1391:4: (otherlv_6= RULE_ID )
            {
            // InternalMyDsl.g:1391:4: (otherlv_6= RULE_ID )
            // InternalMyDsl.g:1392:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_6, grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0());
            				

            }


            }

            this_SEMICOLON_7=(Token)match(input,RULE_SEMICOLON,FOLLOW_28); 

            			newLeafNode(this_SEMICOLON_7, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getTestAccess().getDescriptionKeyword_8());
            		
            this_EQUAL_9=(Token)match(input,RULE_EQUAL,FOLLOW_4); 

            			newLeafNode(this_EQUAL_9, grammarAccess.getTestAccess().getEQUALTerminalRuleCall_9());
            		
            // InternalMyDsl.g:1415:3: ( (lv_descripcion_10_0= ruleEString ) )
            // InternalMyDsl.g:1416:4: (lv_descripcion_10_0= ruleEString )
            {
            // InternalMyDsl.g:1416:4: (lv_descripcion_10_0= ruleEString )
            // InternalMyDsl.g:1417:5: lv_descripcion_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getDescripcionEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_5);
            lv_descripcion_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"descripcion",
            						lv_descripcion_10_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_29); 

            			newLeafNode(this_SEMICOLON_11, grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11());
            		
            // InternalMyDsl.g:1438:3: (otherlv_12= 'Mapping' otherlv_13= '[' ( (lv_mappings_14_0= ruleMapping ) )* otherlv_15= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1439:4: otherlv_12= 'Mapping' otherlv_13= '[' ( (lv_mappings_14_0= ruleMapping ) )* otherlv_15= ']'
                    {
                    otherlv_12=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getTestAccess().getMappingKeyword_12_0());
                    			
                    otherlv_13=(Token)match(input,21,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1());
                    			
                    // InternalMyDsl.g:1447:4: ( (lv_mappings_14_0= ruleMapping ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==36) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:1448:5: (lv_mappings_14_0= ruleMapping )
                    	    {
                    	    // InternalMyDsl.g:1448:5: (lv_mappings_14_0= ruleMapping )
                    	    // InternalMyDsl.g:1449:6: lv_mappings_14_0= ruleMapping
                    	    {

                    	    						newCompositeNode(grammarAccess.getTestAccess().getMappingsMappingParserRuleCall_12_2_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
                    	    lv_mappings_14_0=ruleMapping();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTestRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mappings",
                    	    							lv_mappings_14_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Mapping");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,22,FOLLOW_31); 

                    				newLeafNode(otherlv_15, grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,35,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getTestAccess().getAssertionsKeyword_13());
            		
            otherlv_17=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_17, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalMyDsl.g:1479:3: ( (lv_asertions_18_0= ruleAsercion ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1480:4: (lv_asertions_18_0= ruleAsercion )
            	    {
            	    // InternalMyDsl.g:1480:4: (lv_asertions_18_0= ruleAsercion )
            	    // InternalMyDsl.g:1481:5: lv_asertions_18_0= ruleAsercion
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getAsertionsAsercionParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_asertions_18_0=ruleAsercion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"asertions",
            	    						lv_asertions_18_0,
            	    						"org.xtext.example.mydsl.MyDsl.Asercion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_19=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_19, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:1510:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMyDsl.g:1510:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMyDsl.g:1511:2: iv_ruleMapping= ruleMapping EOF
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
    // InternalMyDsl.g:1517:1: ruleMapping returns [EObject current=null] : (otherlv_0= '{parameter' this_EQUAL_1= RULE_EQUAL ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' otherlv_6= 'value' this_EQUAL_7= RULE_EQUAL ( (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) ) | ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_EQUAL_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_EQUAL_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_datoprimitivo_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1523:2: ( (otherlv_0= '{parameter' this_EQUAL_1= RULE_EQUAL ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' otherlv_6= 'value' this_EQUAL_7= RULE_EQUAL ( (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) ) | ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:1524:2: (otherlv_0= '{parameter' this_EQUAL_1= RULE_EQUAL ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' otherlv_6= 'value' this_EQUAL_7= RULE_EQUAL ( (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) ) | ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:1524:2: (otherlv_0= '{parameter' this_EQUAL_1= RULE_EQUAL ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' otherlv_6= 'value' this_EQUAL_7= RULE_EQUAL ( (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) ) | ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) ) ) otherlv_13= '}' )
            // InternalMyDsl.g:1525:3: otherlv_0= '{parameter' this_EQUAL_1= RULE_EQUAL ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ',' otherlv_6= 'value' this_EQUAL_7= RULE_EQUAL ( (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) ) | ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getParameterKeyword_0());
            		
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_10); 

            			newLeafNode(this_EQUAL_1, grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1533:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:1534:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:1534:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:1535:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getServicioServicioRestCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getFullStopKeyword_3());
            		
            // InternalMyDsl.g:1550:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:1551:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:1551:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:1552:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getParametroParametroCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMappingAccess().getValueKeyword_6());
            		
            this_EQUAL_7=(Token)match(input,RULE_EQUAL,FOLLOW_36); 

            			newLeafNode(this_EQUAL_7, grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_7());
            		
            // InternalMyDsl.g:1575:3: ( (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) ) | ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||(LA21_0>=44 && LA21_0<=45)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1576:4: (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:1576:4: (otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) ) )
                    // InternalMyDsl.g:1577:5: otherlv_8= 'request->' ( (otherlv_9= RULE_ID ) ) otherlv_10= '.' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getMappingAccess().getRequestKeyword_8_0_0());
                    				
                    // InternalMyDsl.g:1581:5: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:1582:6: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:1582:6: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:1583:7: otherlv_9= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMappingRule());
                    							}
                    						
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_33); 

                    							newLeafNode(otherlv_9, grammarAccess.getMappingAccess().getReferenciaEntidadEntidadCrossReference_8_0_1_0());
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,37,FOLLOW_10); 

                    					newLeafNode(otherlv_10, grammarAccess.getMappingAccess().getFullStopKeyword_8_0_2());
                    				
                    // InternalMyDsl.g:1598:5: ( (otherlv_11= RULE_ID ) )
                    // InternalMyDsl.g:1599:6: (otherlv_11= RULE_ID )
                    {
                    // InternalMyDsl.g:1599:6: (otherlv_11= RULE_ID )
                    // InternalMyDsl.g:1600:7: otherlv_11= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMappingRule());
                    							}
                    						
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_23); 

                    							newLeafNode(otherlv_11, grammarAccess.getMappingAccess().getReferenciaAtributoCrossReference_8_0_3_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1613:4: ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) )
                    {
                    // InternalMyDsl.g:1613:4: ( (lv_datoprimitivo_12_0= ruleDatoPrimitivo ) )
                    // InternalMyDsl.g:1614:5: (lv_datoprimitivo_12_0= ruleDatoPrimitivo )
                    {
                    // InternalMyDsl.g:1614:5: (lv_datoprimitivo_12_0= ruleDatoPrimitivo )
                    // InternalMyDsl.g:1615:6: lv_datoprimitivo_12_0= ruleDatoPrimitivo
                    {

                    						newCompositeNode(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_datoprimitivo_12_0=ruleDatoPrimitivo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRule());
                    						}
                    						set(
                    							current,
                    							"datoprimitivo",
                    							lv_datoprimitivo_12_0,
                    							"org.xtext.example.mydsl.MyDsl.DatoPrimitivo");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalMyDsl.g:1641:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // InternalMyDsl.g:1641:49: (iv_ruleAsercion= ruleAsercion EOF )
            // InternalMyDsl.g:1642:2: iv_ruleAsercion= ruleAsercion EOF
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
    // InternalMyDsl.g:1648:1: ruleAsercion returns [EObject current=null] : (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1654:2: ( (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:1655:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:1655:2: (otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:1656:3: otherlv_0= 'Asercion' otherlv_1= '{' otherlv_2= 'elemento1' ( ( ruleEString ) ) otherlv_4= 'elemento2' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAsercionAccess().getAsercionKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getAsercionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAsercionAccess().getElemento1Keyword_2());
            		
            // InternalMyDsl.g:1668:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1669:4: ( ruleEString )
            {
            // InternalMyDsl.g:1669:4: ( ruleEString )
            // InternalMyDsl.g:1670:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento1ElementoCrossReference_3_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAsercionAccess().getElemento2Keyword_4());
            		
            // InternalMyDsl.g:1688:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1689:4: ( ruleEString )
            {
            // InternalMyDsl.g:1689:4: ( ruleEString )
            // InternalMyDsl.g:1690:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsercionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAsercionAccess().getElemento2ElementoCrossReference_5_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:1712:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:1712:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:1713:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:1719:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1725:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:1726:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:1726:2: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==45) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1727:3: kw= 'true'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1733:3: kw= 'false'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1742:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1742:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1743:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1749:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1755:2: (this_INT_0= RULE_INT )
            // InternalMyDsl.g:1756:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1766:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1766:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1767:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:1773:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1779:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1780:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1780:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1781:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1789:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:1800:1: ruleTipoAtributo returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) ;
    public final Enumerator ruleTipoAtributo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1806:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) ) )
            // InternalMyDsl.g:1807:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            {
            // InternalMyDsl.g:1807:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt24=1;
                }
                break;
            case 47:
                {
                alt24=2;
                }
                break;
            case 48:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1808:3: (enumLiteral_0= 'string' )
                    {
                    // InternalMyDsl.g:1808:3: (enumLiteral_0= 'string' )
                    // InternalMyDsl.g:1809:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1816:3: (enumLiteral_1= 'int' )
                    {
                    // InternalMyDsl.g:1816:3: (enumLiteral_1= 'int' )
                    // InternalMyDsl.g:1817:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1824:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalMyDsl.g:1824:3: (enumLiteral_2= 'boolean' )
                    // InternalMyDsl.g:1825:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

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
    // InternalMyDsl.g:1835:1: ruleMockaroo returns [Enumerator current=null] : ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) ;
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
            // InternalMyDsl.g:1841:2: ( ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) ) )
            // InternalMyDsl.g:1842:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            {
            // InternalMyDsl.g:1842:2: ( (enumLiteral_0= 'FirstNameType' ) | (enumLiteral_1= 'LastNameType' ) | (enumLiteral_2= 'FamilyNameType' ) | (enumLiteral_3= 'FullNameType' ) | (enumLiteral_4= 'GenderType' ) | (enumLiteral_5= 'EmailAddressType' ) | (enumLiteral_6= 'PhoneType' ) | (enumLiteral_7= 'CountryType' ) | (enumLiteral_8= 'CityType' ) | (enumLiteral_9= 'CountryCodeType' ) | (enumLiteral_10= 'LatitudeType' ) | (enumLiteral_11= 'LongitudType' ) | (enumLiteral_12= 'RowNumberType' ) | (enumLiteral_13= 'BooleanType' ) )
            int alt25=14;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt25=1;
                }
                break;
            case 50:
                {
                alt25=2;
                }
                break;
            case 51:
                {
                alt25=3;
                }
                break;
            case 52:
                {
                alt25=4;
                }
                break;
            case 53:
                {
                alt25=5;
                }
                break;
            case 54:
                {
                alt25=6;
                }
                break;
            case 55:
                {
                alt25=7;
                }
                break;
            case 56:
                {
                alt25=8;
                }
                break;
            case 57:
                {
                alt25=9;
                }
                break;
            case 58:
                {
                alt25=10;
                }
                break;
            case 59:
                {
                alt25=11;
                }
                break;
            case 60:
                {
                alt25=12;
                }
                break;
            case 61:
                {
                alt25=13;
                }
                break;
            case 62:
                {
                alt25=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1843:3: (enumLiteral_0= 'FirstNameType' )
                    {
                    // InternalMyDsl.g:1843:3: (enumLiteral_0= 'FirstNameType' )
                    // InternalMyDsl.g:1844:4: enumLiteral_0= 'FirstNameType'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1851:3: (enumLiteral_1= 'LastNameType' )
                    {
                    // InternalMyDsl.g:1851:3: (enumLiteral_1= 'LastNameType' )
                    // InternalMyDsl.g:1852:4: enumLiteral_1= 'LastNameType'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1859:3: (enumLiteral_2= 'FamilyNameType' )
                    {
                    // InternalMyDsl.g:1859:3: (enumLiteral_2= 'FamilyNameType' )
                    // InternalMyDsl.g:1860:4: enumLiteral_2= 'FamilyNameType'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1867:3: (enumLiteral_3= 'FullNameType' )
                    {
                    // InternalMyDsl.g:1867:3: (enumLiteral_3= 'FullNameType' )
                    // InternalMyDsl.g:1868:4: enumLiteral_3= 'FullNameType'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1875:3: (enumLiteral_4= 'GenderType' )
                    {
                    // InternalMyDsl.g:1875:3: (enumLiteral_4= 'GenderType' )
                    // InternalMyDsl.g:1876:4: enumLiteral_4= 'GenderType'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1883:3: (enumLiteral_5= 'EmailAddressType' )
                    {
                    // InternalMyDsl.g:1883:3: (enumLiteral_5= 'EmailAddressType' )
                    // InternalMyDsl.g:1884:4: enumLiteral_5= 'EmailAddressType'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1891:3: (enumLiteral_6= 'PhoneType' )
                    {
                    // InternalMyDsl.g:1891:3: (enumLiteral_6= 'PhoneType' )
                    // InternalMyDsl.g:1892:4: enumLiteral_6= 'PhoneType'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1899:3: (enumLiteral_7= 'CountryType' )
                    {
                    // InternalMyDsl.g:1899:3: (enumLiteral_7= 'CountryType' )
                    // InternalMyDsl.g:1900:4: enumLiteral_7= 'CountryType'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1907:3: (enumLiteral_8= 'CityType' )
                    {
                    // InternalMyDsl.g:1907:3: (enumLiteral_8= 'CityType' )
                    // InternalMyDsl.g:1908:4: enumLiteral_8= 'CityType'
                    {
                    enumLiteral_8=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1915:3: (enumLiteral_9= 'CountryCodeType' )
                    {
                    // InternalMyDsl.g:1915:3: (enumLiteral_9= 'CountryCodeType' )
                    // InternalMyDsl.g:1916:4: enumLiteral_9= 'CountryCodeType'
                    {
                    enumLiteral_9=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1923:3: (enumLiteral_10= 'LatitudeType' )
                    {
                    // InternalMyDsl.g:1923:3: (enumLiteral_10= 'LatitudeType' )
                    // InternalMyDsl.g:1924:4: enumLiteral_10= 'LatitudeType'
                    {
                    enumLiteral_10=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1931:3: (enumLiteral_11= 'LongitudType' )
                    {
                    // InternalMyDsl.g:1931:3: (enumLiteral_11= 'LongitudType' )
                    // InternalMyDsl.g:1932:4: enumLiteral_11= 'LongitudType'
                    {
                    enumLiteral_11=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getMockarooAccess().getLongitudTypeEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1939:3: (enumLiteral_12= 'RowNumberType' )
                    {
                    // InternalMyDsl.g:1939:3: (enumLiteral_12= 'RowNumberType' )
                    // InternalMyDsl.g:1940:4: enumLiteral_12= 'RowNumberType'
                    {
                    enumLiteral_12=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1947:3: (enumLiteral_13= 'BooleanType' )
                    {
                    // InternalMyDsl.g:1947:3: (enumLiteral_13= 'BooleanType' )
                    // InternalMyDsl.g:1948:4: enumLiteral_13= 'BooleanType'
                    {
                    enumLiteral_13=(Token)match(input,62,FOLLOW_2); 

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
    // InternalMyDsl.g:1958:1: ruleTipoMetodoRest returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleTipoMetodoRest() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1964:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMyDsl.g:1965:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMyDsl.g:1965:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt26=1;
                }
                break;
            case 64:
                {
                alt26=2;
                }
                break;
            case 65:
                {
                alt26=3;
                }
                break;
            case 66:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1966:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMyDsl.g:1966:3: (enumLiteral_0= 'GET' )
                    // InternalMyDsl.g:1967:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1974:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMyDsl.g:1974:3: (enumLiteral_1= 'POST' )
                    // InternalMyDsl.g:1975:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1982:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalMyDsl.g:1982:3: (enumLiteral_2= 'PUT' )
                    // InternalMyDsl.g:1983:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1990:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMyDsl.g:1990:3: (enumLiteral_3= 'DELETE' )
                    // InternalMyDsl.g:1991:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x8001C00080804002L,0x0000000000000007L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8001C00080000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x8000000080000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001C00000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x7FFE000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000E000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001C00000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00003100000001C0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});

}