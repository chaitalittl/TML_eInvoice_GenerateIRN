<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">


	<xsl:template match="/ResponseObj">
		 <soap:Envelope>			
			<soap:Body>
				<irp_response>
					<ResponseObj>
						<xsl:copy-of select="*" />
					</ResponseObj>
					
				</irp_response>
			</soap:Body>
		</soap:Envelope> 
		
		
	</xsl:template> 

</xsl:stylesheet>